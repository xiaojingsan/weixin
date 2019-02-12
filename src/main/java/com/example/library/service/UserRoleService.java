package com.example.library.service;

import com.example.library.entity.UserRole;

import java.util.List;

public interface UserRoleService {
    /**
     * 添加用户角色
     * @param userRole
     * @return
     */
    int addUserRole(UserRole userRole);

    /**
     * 查询全部的用户角色
     * @return
     */
    List<UserRole> queryAll();

    /**
     * 按照条件查询用户角色
     * @param userRole
     * @return
     */
    List<UserRole> queryUserRole(UserRole userRole);

    /**
     * 更新用户角色
     * @param userRole
     * @return
     */
    int updateUserRole(UserRole userRole);

    /**
     * 删除用户角色
     * @param id
     * @return
     */
    int deleteUserRole(String[] id);
}
