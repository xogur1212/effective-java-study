package com.example.effectivejavastudy.singletonwithdrone.model.dto.request;


import com.example.effectivejavastudy.singletonwithdrone.model.DroneDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DroneDetailRequest {
    private Long droneSeq;
    private DroneDetails droneDetails;
    private Long droneBaseSeq;
    private Long missionSeq;
    private String droneStatus;
    private Long droneSocket;

}
