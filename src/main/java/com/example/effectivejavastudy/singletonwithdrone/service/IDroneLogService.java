package com.example.effectivejavastudy.singletonwithdrone.service;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneLog;

import java.util.Map;

public interface IDroneLogService {

    DroneLog saveDroneLog(DroneLog droneLog);

    DroneLog findByDroneLogSeq(Long droneLogSeq);

    Map<String, Object> findAllDroneLog(Map<String, Object> paramMap);


}
