package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.User;
import com.jk.model.UserBO;
import com.jk.service.IUserService;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yangzhichao on 2017-11-14.
 */
@RestController
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    @RequestMapping("/userList")
    public List<UserBO> userList() {
        List<UserBO> userBOs = userService.userList();
        return userBOs;
    }

    @RequestMapping("/findUserByName")
    public UserBO findUserByName(String name) {
        return userService.findUserByName(name);
    }

    @RequestMapping("/base/json")
    public void exchangeJson(HttpServletRequest request, String callback, Integer id, String name, Integer age, HttpServletResponse response) {
        System.out.println("id:" + id + " name:" + name + " age:" + age);
        List<UserBO> userBOs = userService.userList();
        String json = JSON.toJSONStringWithDateFormat(userBOs, "yyyy-MM-dd HH:mm:ss");
        //加上返回参数
        json=callback+"("+json+")";
        super.outString(json, response);
    }
    @RequestMapping("/addUser")
    public void addUser( String name, Integer age){
        System.out.println( " name:" + name + " age:" + age);
        User user=new User();
        userService.addUser(name,age);
    }

}
