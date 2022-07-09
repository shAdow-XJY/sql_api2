package com.shadowplusing.sql_api2.service;

import com.shadowplusing.sql_api2.entity.User;
import com.shadowplusing.sql_api2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(int id){
        return userMapper.selectById(id);
    }
}
