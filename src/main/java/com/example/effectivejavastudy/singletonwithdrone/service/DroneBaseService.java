package com.example.effectivejavastudy.singletonwithdrone.service;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneBase;
import com.example.effectivejavastudy.singletonwithdrone.repository.DroneBaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DroneBaseService implements IDroneBaseService{
    private final DroneBaseRepository droneBaseRepository;

    @Override
    public List<DroneBase> findAllDroneBase() {
        return droneBaseRepository.findAll();
    }
}
