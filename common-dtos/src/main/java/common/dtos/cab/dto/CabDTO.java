package common.dtos.cab.dto;

import common.dtos.cab.enums.CabTypes;
import lombok.Data;

import java.util.UUID;

@Data
public class CabDTO {
    private CabTypes cabType;
    private String registrationNumber;
}
