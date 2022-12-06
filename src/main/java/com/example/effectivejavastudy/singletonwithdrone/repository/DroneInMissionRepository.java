package com.example.effectivejavastudy.singletonwithdrone.repository;

import com.example.effectivejavastudy.singletonwithdrone.model.Drone;
import com.example.effectivejavastudy.singletonwithdrone.model.DroneInMission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DroneInMissionRepository extends JpaRepository<DroneInMission, Long> {

    Optional<DroneInMission> findByDrone(Drone drone);

    int deleteByDrone(Drone drone);

    @Modifying
    @Query(value = "delete from drone_in_mission  where mission_seq=:case_1", nativeQuery = true)
    void deleteDroneInMission(@Param("case_1") long mission_seq);

    @Modifying
    @Query(value = "delete from drone_in_mission  where drone_seq=:case_1", nativeQuery = true)
    void deleteDroneInMissionbySeq(@Param("case_1") long drone_seq);

}
