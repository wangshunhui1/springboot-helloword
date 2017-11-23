package com.jk.service;

import com.jk.model.UserBO;

import java.util.List;

/**
 * Created by yangzhichao on 2017-11-14.
 */
public interface IUserService {
    //用户列表查询
    public List<UserBO> userList();

    //通过用户名称查询一条用户信息
    public UserBO findUserByName(String name);

    void addUser( String name, Integer age);
}
