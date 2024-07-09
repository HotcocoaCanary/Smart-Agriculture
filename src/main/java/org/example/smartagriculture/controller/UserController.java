package org.example.smartagriculture.controller;

import jakarta.annotation.Resource;
import org.example.smartagriculture.model.User;
import org.example.smartagriculture.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = Logger.getLogger(UserController.class.getName());

    @Resource
    UserService userService;

    @PostMapping("/login")
    public User login(@RequestParam("username") String username, @RequestParam("password") String password) {
        logger.info("登录");
        return userService.login(username, password);
    }
}
