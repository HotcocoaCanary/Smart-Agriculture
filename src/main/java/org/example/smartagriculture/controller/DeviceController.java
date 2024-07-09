package org.example.smartagriculture.controller;

import jakarta.annotation.Resource;
import org.example.smartagriculture.common.R;
import org.example.smartagriculture.model.Device;
import org.example.smartagriculture.service.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {
    @Resource
    DeviceService deviceService;

    /**
     * @Description 按条件查询所有设备
     * @author pujianhua
     * @params bo
     * @date 2024/7/9 17:32
     * @exception
     * @return com.intelligent.common.R<java.util.List<com.intelligent.service.vo.DeviceInfoVo>>
     */
    @PostMapping("/list")
    public R<List<Device>> list(@RequestParam("deviceName") String deviceName,@RequestParam("master") int master) {
        return R.ok(deviceService.list(deviceName,master));
    }

    /**
     * @Description 新增设备
     * @author pujianhua
     * @params deviceInfo
     * @date 2024/7/9 17:32
     * @exception
     * @return com.intelligent.common.R
     */
    @PostMapping("/add")
    public R<Integer> add(@RequestBody Device device) {
        return R.ok(deviceService.add(device));
    }

}
