package com.shadowplusing.sql_api2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shadowplusing.sql_api2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
