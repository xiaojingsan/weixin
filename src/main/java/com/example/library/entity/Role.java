package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;
/**
 * 角色类
 */
@Data
@EqualsAndHashCode
public class Role {
    private String roleID;
    private String roleName;
}
