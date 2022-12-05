package com.example.effectivejavastudy.singletonwithdrone.repository;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneDetailsRepository extends JpaRepository<DroneDetails, Long> {

    DroneDetails findByDroneDetailsSeq(Long droneDetailsSeq);
}
