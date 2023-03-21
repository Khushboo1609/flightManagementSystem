package com.example.education.edTech.controller;


import com.example.education.edTech.entity.*;
import com.example.education.edTech.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/registerUser")
    public void createUser(@RequestBody User user){
            userService.SaveUser(user);
    }

    @GetMapping("/userDetails/{mobileNumber}")
    public User fetchUsers(@PathVariable long mobileNumber){

        User users= userService.fetchUserByMobile(mobileNumber);
        return users;
    }
}
