package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;
/**
 * 权限类
 */

@Data
@EqualsAndHashCode
public class Permission {
    private String permissionID;
    private String permissionName;
    private String permissionUrl;
}
