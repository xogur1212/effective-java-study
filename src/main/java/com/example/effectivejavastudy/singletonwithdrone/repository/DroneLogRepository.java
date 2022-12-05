package com.example.effectivejavastudy.singletonwithdrone.repository;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface DroneLogRepository extends JpaRepository<DroneLog,Long> {

    DroneLog findByDroneLogSeq(Long droneSeq);
    DroneLog findByMissionName(String missionName);

    List<DroneLog> findAll();

    Page<DroneLog> findByInsertDtBetweenAndDroneDeviceNameIgnoreCaseLikeAndMissionNameIgnoreCaseLike(Date beforeDate, Date afterDate, String droneDeviceName, String missionName, Pageable pageable);

    Page<DroneLog> findByInsertDtBetweenAndDroneDeviceNameIgnoreCaseLikeOrInsertDtBetweenAndMissionNameIgnoreCaseLike(Date beforeDate, Date afterDate, String droneDeviceName, Date beforeDate2, Date afterDate2, String missionName, Pageable pageable);

    List<DroneLog> findByInsertDtBetweenAndDroneDeviceNameIgnoreCaseLikeAndMissionNameIgnoreCaseLike(Date beforeDate, Date afterDate, String droneDeviceName, String missionName, Sort sort);

    List<DroneLog> findByInsertDtBetweenAndDroneDeviceNameIgnoreCaseLikeOrInsertDtBetweenAndMissionNameIgnoreCaseLike(Date beforeDate, Date afterDate, String droneDeviceName, Date beforeDate2, Date afterDate2, String missionName,Sort sort);
}
