package org.example.smartagriculture.service;


import org.example.smartagriculture.model.User;

public interface UserService {
    User login(String username, String password);
}
