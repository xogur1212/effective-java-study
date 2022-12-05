package com.example.effectivejavastudy.singletonwithdrone.service;

import com.example.effectivejavastudy.singletonwithdrone.model.DroneSocket;

import java.util.List;

public interface IDroneSocketService {

    List<DroneSocket> getList();

    void saveList(DroneSocket droneSocket);

    void delete();
}
