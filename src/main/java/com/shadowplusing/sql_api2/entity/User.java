package com.shadowplusing.sql_api2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "userinfo2")
public class User {

    @TableId(value = "uid",type = IdType.AUTO)
    private Integer uid;

    private String nickname;
    private String uimg;
    private String uemail;
    private String ulink;

    //有参构造其实也可以用lombok的一个注解，但是不包含在@Data里，我就自己写一下不用注解了
    public User(int uid, String nickname, String uimg, String uemail, String ulink) {
        this.uid = uid;
        this.nickname = nickname;
        this.uimg = uimg;
        this.uemail = uemail;
        this.ulink = ulink;
    }
}
