package com.example.library.controller;

import com.example.library.entity.Role;
import com.example.library.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }


    @GetMapping("queryAll")
    public String queryAll(){
        List<Role> list = roleService.queryRoleAll();
        return list.toString();
    }
    @PostMapping("addrole")
    public String addRole(Role role){
        role.setRoleID(role.getRoleID());
        int n = roleService.addRole(role);
        return String.valueOf(n);
    }
    @PostMapping("queryrole")
    public String queryRole(Role role){
        List<Role> list = roleService.queryRole(role);
        return list.toString();
    }
    @PutMapping("updaterole")
    public String updateRole(Role role){
        int n = roleService.updateRole(role);
        return String.valueOf(n);
    }
    @DeleteMapping("deleterole")
    public String deleteRole(String delitems){
        try {
            String[] strs = delitems.split(",");
            int length = strs.length;
            Map<String, Object> map = new HashMap<String, Object>(1);

            if (length == 0) {
                map.put("num", 0);
            } else {


                int num = roleService.deleteRole(strs);
                map.put("num", num);
                return String.valueOf(num);
            }

        }catch (Exception e ){

        }
        return String.valueOf(0);

    }

}
