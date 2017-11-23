package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.UserBO;
import com.jk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangzhichao on 2017-11-14.
 */
@Service

public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBO> userList() {
        return userMapper.userList();
    }

    @Override
    public UserBO findUserByName(String name) {
        return userMapper.findUserByName(name);
    }

    @Override
    public void addUser( String name, Integer age) {
        userMapper.addUser(name,age);
    }

}
