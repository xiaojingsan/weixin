package com.example.library.controller;

import com.example.library.entity.UserRole;
import com.example.library.service.UserRoleService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("userrole")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @PostMapping("addUserRole")
    public String addUserRole(UserRole userRole){
        userRole.setUserRoleID(UUID.randomUUID().toString());
        int n = userRoleService.addUserRole(userRole);
        return String.valueOf(n);
    }
    @GetMapping("queryAll")
    public String queryAll(){
        List<UserRole> list = userRoleService.queryAll();
        return list.toString();
    }

    @GetMapping("queryUserRole")
    public String queryUserRole(UserRole userRole){
        List<UserRole> list = userRoleService.queryUserRole(userRole);
        return list.toString();
    }
    @PutMapping("updateUserRole")
    public String updateUserRole(UserRole userRole){
        int n = userRoleService.updateUserRole(userRole);
        return String.valueOf(n);
    }
    @DeleteMapping("deleteUserRole")
    public String deleteUserRole(@Param("delitems") String delitems){
        try {
            String[] strs = delitems.split(",");
            int length = strs.length;
            Map<String, Object> map = new HashMap<String, Object>(1);

            if (length == 0) {
                map.put("num", 0);
            } else {
                int num = userRoleService.deleteUserRole(strs);
                map.put("num", num);
                return String.valueOf(num);
            }

        }catch (Exception e ){

        }
        return String.valueOf(0);
    }

}
