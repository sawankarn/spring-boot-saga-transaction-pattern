package com.youtube.javapuzzle.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.javapuzzle.service.DriverService;
import common.dtos.driver.events.UpdateDriverStatusEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DriverListener {
    private final DriverService driverService;
    @Autowired
    public DriverListener(DriverService driverService){this.driverService = driverService;}
    @KafkaListener(topics = "update-driver-event", groupId = "cab-group")
    public void updateDriverEvent(String event) throws JsonProcessingException {
        UpdateDriverStatusEvent statusEvent = new ObjectMapper().readValue(event, UpdateDriverStatusEvent.class);
        driverService.updateDriveStatus(statusEvent.getDriverId(), statusEvent.getDriverStatus());
    }
}
