package com.cwj.springbootdemo.dao;

import com.cwj.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "password",column = "password")
    })
    @Select("select * from t_user where name=#{name} and password=#{password}")
    List<User> selectUsers(User user);
}
