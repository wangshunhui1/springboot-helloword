package com.jk.controller;

import com.jk.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangzhichao on 2017-11-14.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("user/{macAddress}")
    public String getByMacAddress(@PathVariable String macAddress){
        return "hello" + macAddress;
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setPassword("123456");
        user.setUsername("小明");
        user.setId(1);
        return user;
    }
}
