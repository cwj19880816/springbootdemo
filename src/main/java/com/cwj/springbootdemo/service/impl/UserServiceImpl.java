package com.cwj.springbootdemo.service.impl;

import com.cwj.springbootdemo.dao.UserMapper;
import com.cwj.springbootdemo.entity.User;
import com.cwj.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public boolean loginVerify(User user) {
        List<User> users=userMapper.selectUsers(user);
        if (users.size()>0){
            return true;
        }else {
            return false;
        }
    }
}
