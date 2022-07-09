package com.shadowplusing.sql_api2.controller;

import com.shadowplusing.sql_api2.entity.User;
import com.shadowplusing.sql_api2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/id={uid}")
    public User getById(@PathVariable int uid){
        return userService.findById(uid);
    }

}
