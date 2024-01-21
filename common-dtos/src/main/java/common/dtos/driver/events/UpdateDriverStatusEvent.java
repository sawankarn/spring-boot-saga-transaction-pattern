package common.dtos.driver.events;

import common.dtos.enums.CommonStatus;
import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UpdateDriverStatusEvent {
    private UUID driverId;
    private CommonStatus driverStatus;
}
