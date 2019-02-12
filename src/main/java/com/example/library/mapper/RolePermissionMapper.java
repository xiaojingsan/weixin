package com.example.library.mapper;

import com.example.library.entity.RolePermission;

import java.util.List;

public interface RolePermissionMapper {
    /**
     * 添加角色_权限
     * @param rolePermission
     * @return
     */
    int addRolePermission(RolePermission rolePermission);

    /**
     * 查找所有
     * @return
     */
    List<RolePermission> queryAll();

    /**
     * 根据条件查询角色—权限
     * @param rolePermission
     * @return
     */
    List<RolePermission> queryRolePermission(RolePermission rolePermission);

    /**
     * 更新角色权限
     * @param rolePermission
     * @return
     */
    int updateRolePermission(RolePermission rolePermission);

    /**
     * 删除角色权限
     * @param id
     * @return
     */
    int deleteRolePermission(String[] id);

}
