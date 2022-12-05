package com.example.effectivejavastudy.singletonwithdrone.service;

import com.example.effectivejavastudy.singletonwithdrone.model.Mission;
import com.example.effectivejavastudy.singletonwithdrone.model.dto.Result;

import java.util.List;
import java.util.Map;

public interface IMissionService {

    List<Mission> findAllMission();

    Mission findOneMission(Long missionSeq);

    List<Mission> findMissionList(Map<String, Object> paramMap);

    Long saveMission(Mission mission);

    int updateMission(Mission mission);

    Result deleteMission(Mission mission);

}
