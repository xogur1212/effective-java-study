package com.example.effectivejavastudy.singletonwithdrone.service;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneLogDetails;
import com.example.effectivejavastudy.singletonwithdrone.repository.DroneLogDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DroneLogDetailsService implements IDroneLogDetailsService {

    private final DroneLogDetailsRepository droneLogDetailsRepository;

    @Override
    public DroneLogDetails saveDroneLogDetails(DroneLogDetails droneLogDetails) {


        return droneLogDetailsRepository.save(droneLogDetails);
    }


}
