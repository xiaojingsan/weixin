package com.example.library.mapper;

import com.example.library.entity.Permission;

import java.util.List;

public interface PermissionMapper {
    /**
     * 添加权限
     * @param permission
     * @return
     */
    int addPermission(Permission permission);

    /**
     *查询全部权限
     * @return
     */
    List<Permission> queryAll();

    /**
     * 根据条件查询权限
     * @param permission
     * @return
     */
    List<Permission> queryPermission(Permission permission);

    /**
     * 更新权限
     * @param permission
     * @return
     */
    int updatePermission(Permission permission);

    /**
     * 删除权限
     * @param id
     * @return
     */
    int deletePermission(String[] id);
}
