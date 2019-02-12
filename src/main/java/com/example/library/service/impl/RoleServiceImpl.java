package com.example.library.service.impl;

import com.example.library.entity.Role;
import com.example.library.mapper.RoleMapper;
import com.example.library.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public int addRole(Role role) {
        return roleMapper.addRole(role);
    }

    @Override
    public List<Role> queryRoleAll() {
        return roleMapper.queryRoleAll();
    }

    @Override
    public List<Role> queryRole(Role role) {
        return roleMapper.queryRole(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public int deleteRole(String[] id) {
        return roleMapper.deleteRole(id);
    }
}
