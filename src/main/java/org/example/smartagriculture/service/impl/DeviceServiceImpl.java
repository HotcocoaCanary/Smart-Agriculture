package org.example.smartagriculture.service.impl;

import jakarta.annotation.Resource;
import org.example.smartagriculture.mapper.DeviceMapper;
import org.example.smartagriculture.model.Device;
import org.example.smartagriculture.model.DeviceExample;
import org.example.smartagriculture.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DeviceInfoServiceImpl
 * @Description: TODO
 * @author: pujianhua
 * @Date: 2024/7/9 17:25
 * History:
 * <author>          <time>          <version>          <desc>
 * pujianhua     2024/7/9 17:25     1.0             TODO
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    private static Logger logger = LoggerFactory.getLogger(DeviceServiceImpl.class);
    @Resource
    DeviceMapper deviceMapper;

    @Override
    public List<Device> list(String deviceName,int master) {
        DeviceExample deviceExample = new DeviceExample();
        deviceExample.createCriteria()
                .andDeviceNameEqualTo(deviceName)
                .andMasterEqualTo(master);
        List<Device> deviceList = deviceMapper.selectByExample(deviceExample);
        logger.info("查询结果：{}", deviceList);
        return deviceList;
    }

    @Override
    public int add(Device device) {
        return deviceMapper.insertSelective(device);
    }
}
