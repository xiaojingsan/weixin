package com.example.library.service.impl;

import com.example.library.entity.Permission;
import com.example.library.mapper.PermissionMapper;
import com.example.library.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public int addPermission(Permission permission) {
        return permissionMapper.addPermission(permission);
    }

    @Override
    public List<Permission> queryAll() {
        return permissionMapper.queryAll();
    }

    @Override
    public List<Permission> queryPermission(Permission permission) {
        return permissionMapper.queryPermission(permission);
    }

    @Override
    public int updatePermission(Permission permission) {
        return permissionMapper.updatePermission(permission);
    }

    @Override
    public int deletePermission(String[] id) {
        return permissionMapper.deletePermission(id);
    }
}
