package common.dtos.driver.dto;

import common.dtos.cab.dto.CabDTO;
import lombok.Data;

@Data
public class DriverDTO {
    private String driverName;
    private String driverEmail;
    private String driverLocation;
    private CabDTO cabDTO;
}
