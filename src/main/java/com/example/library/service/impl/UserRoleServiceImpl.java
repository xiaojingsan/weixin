package com.example.library.service.impl;

import com.example.library.entity.UserRole;
import com.example.library.mapper.UserRoleMapper;
import com.example.library.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService{
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int addUserRole(UserRole userRole) {
        return userRoleMapper.addUserRole(userRole);
    }

    @Override
    public List<UserRole> queryAll() {
        return userRoleMapper.queryAll();
    }

    @Override
    public List<UserRole> queryUserRole(UserRole userRole) {
        return userRoleMapper.queryUserRole(userRole);
    }

    @Override
    public int updateUserRole(UserRole userRole) {
        return userRoleMapper.updateUserRole(userRole);
    }

    @Override
    public int deleteUserRole(String[] id) {
        return userRoleMapper.deleteUserRole(id);
    }
}
