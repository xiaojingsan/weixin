package com.example.library.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
//public class MyWebConfigurer extends WebMvcConfigurationSupport {
//
//
//    @Override
//    protected void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/login").setViewName("/login");
//        registry.addViewController("/error/403").setViewName("/error/403");
//        registry.addViewController("/error/500").setViewName("/error/500");
//        super.addViewControllers(registry);
//    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//            //    .excludePathPatterns("/user/login") ;//不拦截的url
//                .addPathPatterns("/permission/*");  //拦截url
//        super.addInterceptors(registry);
//    }
//}
//
