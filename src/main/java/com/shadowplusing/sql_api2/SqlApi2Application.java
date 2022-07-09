package com.shadowplusing.sql_api2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shadowplusing.sql_api2.mapper")
public class SqlApi2Application {

    public static void main(String[] args) {
        SpringApplication.run(SqlApi2Application.class, args);
    }

}
