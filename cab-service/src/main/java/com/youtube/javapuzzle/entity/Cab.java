package com.youtube.javapuzzle.entity;

import common.dtos.cab.enums.CabTypes;
import common.dtos.enums.CommonStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "cab")
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cab_id")
    private UUID cabId;

    @Column(name = "driver_id")
    private UUID driverId;

    @Enumerated(EnumType.STRING)
    @Column(name = "cab_type")
    private CabTypes cabType;

    @Column(name = "registration_number")
    private String registrationNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "cab_status")
    private CommonStatus cabStatus;
}
