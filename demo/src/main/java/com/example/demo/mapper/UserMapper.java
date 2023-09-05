package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public int SelectUserByPwdAndUserId(@Param("id")String id, @Param("pwd")String pwd);
}
