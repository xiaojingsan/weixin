package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;
/**
 * 用户_角色类
 */
@Data
@EqualsAndHashCode
public class UserRole {
    private String userRoleID;
    private String userID;
    private String roleID;
}
