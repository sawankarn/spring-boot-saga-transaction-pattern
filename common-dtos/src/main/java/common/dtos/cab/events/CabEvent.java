package common.dtos.cab.events;

import common.dtos.cab.enums.CabTypes;
import lombok.*;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CabEvent {
    private UUID driverId;
    private CabTypes cabType;
    private String registrationNumber;
}
