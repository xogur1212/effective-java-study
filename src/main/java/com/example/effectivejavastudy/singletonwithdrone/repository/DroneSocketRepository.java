package com.example.effectivejavastudy.singletonwithdrone.repository;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneSocket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DroneSocketRepository extends JpaRepository<DroneSocket,Long> {

    DroneSocket findByDroneSocketSeq(Long droneSocketSeq);

    List<DroneSocket> findAll();

    void deleteAllInBatch();

    void deleteAllBySystemId(int systemId);

}
