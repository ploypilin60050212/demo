package com.example.demo.controller;

import com.example.demo.model.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @GetMapping("/users")
    public UserResponse getUserById(int id) {
        UserResponse userResponse = new UserResponse();
        return userResponse;
    }
}
