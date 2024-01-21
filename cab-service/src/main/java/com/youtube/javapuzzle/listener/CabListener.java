package com.youtube.javapuzzle.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.javapuzzle.entity.Cab;
import com.youtube.javapuzzle.service.CabService;
import common.dtos.cab.events.CabEvent;
import common.dtos.driver.events.UpdateDriverStatusEvent;
import common.dtos.enums.CommonStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CabListener {
    private final CabService cabService;
    private KafkaTemplate<String, UpdateDriverStatusEvent> updateDriverStatusEventKafkaTemplate;
    @Autowired
    public CabListener(CabService cabService, KafkaTemplate<String, UpdateDriverStatusEvent> updateDriverStatusEventKafkaTemplate){
        this.cabService = cabService;
        this.updateDriverStatusEventKafkaTemplate = updateDriverStatusEventKafkaTemplate;
    }

    @KafkaListener(topics = "add-cab-event", groupId = "driver-group")
    public void addCabEventDetails(String event) throws Exception {
        CabEvent cabEvent = new ObjectMapper().readValue(event, CabEvent.class);
        boolean cabExists = cabService.existsByRegistrationNumberAndCabStatus(
                cabEvent.getRegistrationNumber(), CommonStatus.SUCCESS);
        if(cabExists){
            saveCabDetailsAndUpdateDriverEvent(cabEvent, CommonStatus.FAILED);
        }
        else {
            saveCabDetailsAndUpdateDriverEvent(cabEvent, CommonStatus.SUCCESS);
        }

    }

    private void saveCabDetailsAndUpdateDriverEvent(CabEvent cabEvent, CommonStatus commonStatus) {
        Cab cab = saveCabDetails(cabEvent, commonStatus);
        updateDriverEvent(cab, commonStatus);
    }

    private void updateDriverEvent(Cab cab, CommonStatus driverStatus) {
        UpdateDriverStatusEvent statusEvent = UpdateDriverStatusEvent.builder()
                .driverId(cab.getDriverId())
                .driverStatus(driverStatus)
                .build();
        updateDriverStatusEventKafkaTemplate.send("update-driver-event", statusEvent);
    }

    private Cab saveCabDetails(CabEvent cabEvent, CommonStatus cabStatus) {
        return cabService.saveCab(Cab.builder()
                .driverId(cabEvent.getDriverId())
                .registrationNumber(cabEvent.getRegistrationNumber())
                .cabType(cabEvent.getCabType())
                .cabStatus(cabStatus)
                .build());
    }
}
