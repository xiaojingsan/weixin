package com.example.library.service.impl;

import com.example.library.entity.RolePermission;
import com.example.library.mapper.RolePermissionMapper;
import com.example.library.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionServiceImpl implements RolePermissionService{
    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public int addRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.addRolePermission(rolePermission);
    }

    @Override
    public List<RolePermission> queryAll() {
        return rolePermissionMapper.queryAll();
    }

    @Override
    public List<RolePermission> queryRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.queryRolePermission(rolePermission);
    }

    @Override
    public int updateRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.updateRolePermission(rolePermission);
    }

    @Override
    public int deleteRolePermission(String[] id) {
        return rolePermissionMapper.deleteRolePermission(id);
    }
}
