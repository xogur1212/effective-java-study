package com.example.effectivejavastudy.singletonwithdrone.service;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneDetails;
import com.example.effectivejavastudy.singletonwithdrone.model.dto.Result;
import com.example.effectivejavastudy.singletonwithdrone.model.dto.request.DroneDetailRequest;

public interface IDroneDetailsService {

    DroneDetails saveDroneDetails(DroneDetails droneDetails, Long droneId);

    Result updateDroneDetails(DroneDetailRequest droneDetailRequest);

    DroneDetails findDroneDetails(Long droneDetailsSeq);

    Result updateDroneDetailsFileName(String fileName, long droneSeq);


}
