package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.UUID;
/**
 * 角色_权限类
 */
@Data
@EqualsAndHashCode
public class RolePermission {
    private String rolePermissionID;
    private String roleID;
    private String permissionID;
}
