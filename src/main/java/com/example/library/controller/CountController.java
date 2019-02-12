package com.example.library.controller;
import com.example.library.code.QRCodeUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/count")
public class CountController {
    @RequestMapping("/code")
    public ModelAndView showCode() throws Exception {
        String text = "http://baidu.com";
        System.out.println("正在生成二维码，请稍等。。。。");
        QRCodeUtil.encode(text, "E:\\library\\src\\main\\resources\\static\\report.jpg", "E:\\library\\src\\main\\resources\\static\\", true);
        System.out.println("已生成，请在 E:\\library\\src\\main\\resources\\static 目录下查看");
        ModelAndView mv = new ModelAndView("redirect:/showcode.html");
        return mv;
    }
}
