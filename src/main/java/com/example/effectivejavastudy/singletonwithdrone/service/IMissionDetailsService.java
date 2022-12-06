package com.example.effectivejavastudy.singletonwithdrone.service;

import com.example.effectivejavastudy.singletonwithdrone.model.MissionDetails;
import com.example.effectivejavastudy.singletonwithdrone.model.dto.Result;

import java.util.List;
import java.util.Map;

public interface IMissionDetailsService {

    Result saveMission(List<MissionDetails> missionDetails, long mission_id, double Distance);

    Result updateMissionDetails(List<MissionDetails> missionDetails, long mission_id);

    List<MissionDetails> findMissionDetailsList(Map<String, Object> paramMap);

}
