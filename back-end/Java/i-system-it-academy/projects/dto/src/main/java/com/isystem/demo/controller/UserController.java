package com.isystem.demo.controller;

import com.isystem.demo.dto.UserLocationDTO;
import com.isystem.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired private UserService userService;

    @GetMapping("/getAll")
    public List<UserLocationDTO> getAll(){
        return userService.getAllUsersLocation();
    }

}
