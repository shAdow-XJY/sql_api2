package com.shadowplusing.sql_api2;

import com.shadowplusing.sql_api2.entity.User;
import com.shadowplusing.sql_api2.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SqlApi2ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testMyBatisPlus() {
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
