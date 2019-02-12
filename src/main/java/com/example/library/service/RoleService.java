package com.example.library.service;

import com.example.library.entity.Role;

import java.util.List;

public interface RoleService {
    /**
     * 添加角色
     * @param role
     * @return
     */
    public int addRole(Role role);

    /**
     * 查询全部角色
     * @return
     */
    public List<Role> queryRoleAll();

    /**
     * 根据条件查询角色
     * @param role
     * @return
     */
    public List<Role> queryRole(Role role);

    /**
     * 修改角色
     * @param role
     * @return
     */
    public int updateRole(Role role);

    /**
     * 删除Role
     * @param id
     * @return
     */
    public  int deleteRole(String[] id);
}
