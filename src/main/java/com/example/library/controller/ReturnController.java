package com.example.library.controller;

import com.example.library.entity.*;
import com.example.library.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/return")
public class ReturnController {
    @Autowired
    BorrowService borrowService;
    @Autowired
    ReturnService returnService;
    @Autowired
    UserService userService;
    @Autowired
    BookService bookService;
    @Autowired
    PositionService positionService;
@PostMapping("/addReturn")
    public void addReturnRecord(Return returnBook){
        returnBook.setReturnID(UUID.randomUUID().toString());
        User user= new User();
        user.setUserID(returnBook.getUserID());
        List<User> list = userService.queryUser(user);
        User u = list.get(0);
        System.out.println(u+"还书人"+returnBook.getBookID()+";;;"+returnBook.getUserID());
        Book b = bookService.selectBookByID(returnBook.getBookID());
        System.out.println(b+"书本");
        if(b.getBookStatus().equals("已借出")) {
            returnBook.setBookID(b.getBookID());
            returnBook.setUserID(u.getUserID());
            returnBook.setReturnTime(new Date());
        }else{
            return;
        }
        //通过bookID得到borrow对象
        Borrow borrow=borrowService.queryBorrowRecordsByBookID(returnBook.getBookID());
       //如果借出的书就是归还的这本书
    if(borrow.getBookID().equals(returnBook.getBookID())){
        //如果借出日期+90天<还书日期，则超期
        Date borrowDate=borrow.getBorrowTime();
        Date returnDate=returnBook.getReturnTime();
        long newTime=convert(borrowDate,90);//借书日期加上90天
        long  returnTime=convert(returnDate,0);//还书日期加上0天
        System.out.println("borrowDate"+borrowDate);
        System.out.println("newTime"+newTime);
        if(newTime<returnTime){
            returnBook.setOverTime("是");
        }else{
            returnBook.setOverTime("否");
        }
    }
        int n =  returnService.addReturnRecord(returnBook);
        Position p = new Position();
        p.setPositionID(p.getPositionID());
        p.setBookID(b.getBookID());
        List<Position>list1  =positionService.queryPosition(p);
        System.out.println("正在归还"+list1.get(0));
        positionService.addPosition(list1.get(0));
        System.out.println("--------------------");
        b.setBookStatus("在馆");
        bookService.updateBook(b);
        System.out.println("还书成功");

    }
    public static long convert(Date date,long day){
        long time=date.getTime();//得到指定日期的毫秒数
        day=day*24*60*60*1000;//要加上的天数转换成毫秒数
        time+=day;//相加得到新的毫秒数
        return time;//将毫秒数转换成日期
    }
    @GetMapping("/findAllReturn")
    public String findAllReturn(){
        System.out.println("****************");
        List<Return> list =  returnService.findAllReturnRecords();
        list.forEach((p)->System.out.println(p));
        System.out.println("****************");
        return list.toString();
    }
    @PutMapping("/updateReturn")
    public String  updateReturnRecord(Return returnBook){
        int n = returnService.updateReturnRecord(returnBook);
       Return re1=new Return();
        re1.setReturnID("1");
        Return re2 = returnService.queryReturnRecords(re1).get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(returnBook.toString()+"   "+re2.toString());
        System.out.println("-------------"+sb.toString());
        return sb.toString();
    }
    @PostMapping("/queryReturn")
    public String  queryReturnRecords(Return returnBook){

        List<Return> list = new ArrayList<Return>();
        System.out.println(returnBook+"-------------");
        list = returnService.queryReturnRecords(returnBook);
        return list.toString();
    }
}
