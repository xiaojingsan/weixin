package com.example.library.controller;

import com.example.library.entity.RolePermission;
import com.example.library.service.RolePermissionService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping
public class RolePermissionController {
    @Autowired
    private RolePermissionService rolePermissionService;

    @PostMapping("addRolePermission")
    public String addRolePermission(RolePermission rolePermission){
        int n = rolePermissionService.addRolePermission(rolePermission);
        return String.valueOf(n);
    }

}
