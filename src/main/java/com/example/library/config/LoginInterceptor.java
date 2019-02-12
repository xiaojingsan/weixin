package com.example.library.config;


import com.example.library.entity.User;
import com.example.library.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//
//@Component
//public class LoginInterceptor implements HandlerInterceptor {
//    @Autowired
//    private UserService userService;
//
//    private static final Logger logger= LoggerFactory.getLogger(LoginInterceptor.class);
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
//        logger.info("---------------------开始进入请求地址拦截----------------------------");
//        System.out.println("---请求拦截开始---");
//        //StringBuffer uri=request.getRequestURL();
//        HttpSession session=request.getSession();
//        User user = (User)session.getAttribute("user");
//        System.out.println(user);
//        String subUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
//        String reUrl = subUrl+"/login.html";
//        if(request.getRequestURL().equals(reUrl)){
//            System.out.println("*********");
//            response.sendRedirect(reUrl);
//            return true;
//        }
//
//        if(user== null){
//            logger.info("用户未登录，跳转至登陆页面:"+reUrl);
//            response.sendRedirect(reUrl);
//            return false;
//        }
//
//        System.out.println("-"+subUrl);
//        String url = request.getRequestURI();
//        System.out.println("*"+url);
//
//        if(url.indexOf("/user") >= 0) {
//            System.out.println("*****");
//            if(user == null){
//                response.sendRedirect(request.getContextPath()+"/");
//                logger.info("用户权限错误，不允许进行请求:"+request.getRequestURL());
//                return false;
//            }
//        }
//        System.out.println("*********");
//        return true;
//
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("请求ing");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//          System.out.println("请求结束");
//    }
//}

