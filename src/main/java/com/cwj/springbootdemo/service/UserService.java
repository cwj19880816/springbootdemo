package com.cwj.springbootdemo.service;

import com.cwj.springbootdemo.entity.User;

import java.util.List;

public interface UserService {
    boolean loginVerify(User user);
}
