package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.entity.ReportDataBean;
import com.example.library.service.BookService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.List;
@RestController
@RequestMapping("/book")
@Api
public class BookController {
    @Autowired
    private BookService  bookService;
    //自定义类型转换器
    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(
                Date.class,
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增书表")
    public ModelAndView addBook(Book book){
        book.setBookStatus("在馆");
        book.setBookNumber(1);
        book.setBookID(UUID.randomUUID().toString());
        book.setBookEnterTime(new Date());
        System.out.println("book"+book+"}}}}}}}}}}}}}}}");
        bookService.addBook(book);
        ModelAndView mv = new ModelAndView("redirect:/book.html");
        return mv;
    }
    @GetMapping("/search")
    public List<Book> searchBook(){
        List<Book> bookList=bookService.searchBook();
        return bookList;
    }
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public ReportDataBean showdata(){
        ReportDataBean jsonObj = new ReportDataBean();
        List categories=bookService.showdata();
        List data=bookService.showdata1();
        jsonObj.setCategories(categories);
        jsonObj.setData(data);
        categories.forEach(p->System.out.println(p));
        data.forEach(p->System.out.println(p));
        return jsonObj;
    }
    @GetMapping("/select")
    public List<Book> selectBook(String bookName){
        List<Book> book=bookService.selectBook(bookName);
        ModelAndView mv = new ModelAndView("redirect:/showOneBook.html");
        return book;
    }
    @PostMapping("/selectByID")
    public Book selectBookByID(String bookID){
        Book book=bookService.selectBookByID(bookID);
       /* ModelAndView mv = new ModelAndView("redirect:/book.html");*/
        return book;
    }
    @GetMapping("/delete")
    public ModelAndView deleteBook(String bookID){
        bookService.deleteBook(bookID);
        ModelAndView mv = new ModelAndView("redirect:/book.html");
        return mv;
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ModelAndView updateBook(Book book){
        System.out.println("更新");
        bookService.updateBook(book);
        ModelAndView mv = new ModelAndView("redirect:/book.html");
        return mv;
    }
}
