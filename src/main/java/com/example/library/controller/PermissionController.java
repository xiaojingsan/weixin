package com.example.library.controller;

import com.example.library.entity.Permission;
import com.example.library.service.PermissionService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Controller
@RequestMapping("permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @PostMapping("addPermission")
    public String addPermission(Permission permission){
        int n = permissionService.addPermission(permission);
        return String.valueOf(n);
    }
    @GetMapping("queryAll")
    public String queryAll(){
        List<Permission> list = permissionService.queryAll();
        return list.toString();
    }
    @GetMapping("queryPermission")
    public String queryPermission(Permission permission){
        List<Permission> list =  permissionService.queryPermission(permission);
        return list.toString();
    }
    @PutMapping("updatePermission")
    public String updatePermission(Permission permission){
        int n = permissionService.updatePermission(permission);
        return String.valueOf(n);
    }
    @DeleteMapping("deletePermission")
    public String deletePermission(String delitems){
        try {
            String[] strs = delitems.split(",");
            int length = strs.length;
            Map<String, Object> map = new HashMap<String, Object>(1);

            if (length == 0) {
                map.put("num", 0);
            } else {


                int num = permissionService.deletePermission(strs);
                map.put("num", num);
                return String.valueOf(num);
            }

        }catch (Exception e ){

        }
        return String.valueOf(0);
    }
}
