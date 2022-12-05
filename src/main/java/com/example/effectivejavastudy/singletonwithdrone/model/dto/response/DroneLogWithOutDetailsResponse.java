package com.example.effectivejavastudy.singletonwithdrone.model.dto.response;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneLog;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DroneLogWithOutDetailsResponse {


    private Long id;
    private String droneDeviceName;
    private String missionName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd kk:mm:ss", timezone = "Asia/Seoul")
    private Timestamp insertDt;


    public DroneLogWithOutDetailsResponse(DroneLog droneLog){
        this.id=droneLog.getDroneLogSeq();
        this.droneDeviceName=droneLog.getDroneDeviceName();
        this.missionName=droneLog.getMissionName();
        this.insertDt=droneLog.getInsertDt();

    }
}
