package org.example.smartagriculture.service;

import org.example.smartagriculture.model.Device;

import java.util.List;

public interface DeviceService {
    List<Device> list(String deviceName, int master);

    int add(Device device);
}
