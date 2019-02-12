package com.example.library.controller;

import com.example.library.entity.User;
import com.example.library.service.UserService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request, String  userNumber, String userPassword){
        System.out.println("---------------------" );
        User user = userService.login(userNumber,userPassword);
        System.out.println(user+"---------------------" );
        request.getSession().setAttribute("user",user);
        if(user != null){
            System.out.println("userSuccess:"+user );
            ModelAndView mv = new ModelAndView("redirect:/book.html");
            return  mv;
        }else{
            System.out.println("登陆失败");
            return null;
        }
    }


    @GetMapping("queryAll")
    public String queryAll(){
        List<User> list = new ArrayList<User>();
        list = userService.queryAll();
        return list.toString();
    }
    @PostMapping("queryUser")
    public String queryUser(User user){
        System.out.println("----------");
        user.setUserID(null);
        List<User> list = new ArrayList<User>();
        list = userService.queryUser(user);
        list.forEach((p)->System.out.println(p));
        return list.toString();
    }
    @PutMapping("updateUser")
    public String updateUser(User user){
        int n = userService.updateUser(user);
        User user2 = new User();
        user2.setUserID("1");
        User user1 = userService.queryUser(user2).get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(user.toString()+"   "+user1.toString());
        return sb.toString();
    }
    @DeleteMapping("deleteUser")
    public String deleteUser(String delitems){
        try {
            String[] strs = delitems.split(",");
            int length = strs.length;
            Map<String, Object> map = new HashMap<String, Object>(1);

            if (length == 0) {
                map.put("num", 0);
            } else {


                int num = userService.deleteUser(strs);
                map.put("num", num);
                return String.valueOf(num);
            }

        }catch (Exception e ){

        }
        return String.valueOf(0);
    }

}
