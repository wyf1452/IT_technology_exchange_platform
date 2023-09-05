package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user")
    @ResponseBody
    public String demo(){
        System.out.println(userMapper.SelectUserByPwdAndUserId("1","1"));
        return "hello.word";
    }
}
//<dependency>
//<groupId>mysql</groupId>
//<artifactId>mysql-connector-java</artifactId>
//<version>5.1.38</version>
//</dependency>
//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-starter-jdbc</artifactId>
//</dependency>

