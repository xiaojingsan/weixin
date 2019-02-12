package com.example.library.service.impl;

import com.example.library.entity.User;
import com.example.library.mapper.UserMapper;
import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public List<User> queryUser(User user) {
        return userMapper.queryUser(user);
    }

    @Override
    public int deleteUser(String[] id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User login(String userNumber, String userPassword) {
        return userMapper.login(userNumber,userPassword);
    }
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
