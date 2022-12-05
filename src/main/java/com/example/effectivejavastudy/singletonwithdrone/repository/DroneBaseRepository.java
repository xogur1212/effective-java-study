package com.example.effectivejavastudy.singletonwithdrone.repository;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DroneBaseRepository extends JpaRepository<DroneBase, Long> {

    Optional<DroneBase> findByDroneBaseSeq(Long droneBaseSeq);
}
