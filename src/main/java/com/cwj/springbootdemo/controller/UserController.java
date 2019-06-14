package com.cwj.springbootdemo.controller;

import com.cwj.springbootdemo.entity.User;
import com.cwj.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        boolean flag = userService.loginVerify(new User(name, password));
        if (flag) {
            return "index";
        } else {
            return "login";
        }
    }
}
