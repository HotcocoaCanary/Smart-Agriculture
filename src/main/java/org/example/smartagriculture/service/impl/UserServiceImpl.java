package org.example.smartagriculture.service.impl;

import jakarta.annotation.Resource;
import org.example.smartagriculture.mapper.UserMapper;
import org.example.smartagriculture.model.User;
import org.example.smartagriculture.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.getUserByUsernameAndPassword(username, password);
    }
}

