package com.jk.dao;

import com.jk.model.UserBO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yangzhichao on 2017-11-14.
 */
@Mapper
public interface UserMapper {

    //查询用户列表信息
    @Select("select * from user")
    public List<UserBO> userList();
    @Select("select * from user where name = #{name} ")
    public UserBO findUserByName(@Param("name") String name);
    @Insert("insert into user (name,age) values (#{name},#{age})")
    void addUser( String name, Integer age);
}
