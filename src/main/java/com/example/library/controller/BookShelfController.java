package com.example.library.controller;

import com.example.library.entity.BookShelf;
import com.example.library.entity.Borrow;
import com.example.library.entity.User;
import com.example.library.mapper.BookShelfMapper;
import com.example.library.service.BookShelfService;
import com.example.library.service.UserService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/bookshelf")
public class BookShelfController {
    @Autowired
    private BookShelfService bookShelfService;


    @PostMapping("/addBookshelf")
    public String addBorrowRecord(BookShelf bookShelf) {
        bookShelf.setBookshelfID(UUID.randomUUID().toString());
        int n = bookShelfService.addBookShelf(bookShelf);
        return String.valueOf(n);

    }
    @GetMapping("/queryAll")
    public String queryAll(){
        List<BookShelf> list = new ArrayList<BookShelf>();
        list = bookShelfService.queryAll();
        list.forEach((p)->System.out.println(p));
        return list.toString();
    }
    @PostMapping("/queryBookShelf")
    public String queryBookShelf(BookShelf bookShelf){
        bookShelf.setBookshelfID(null);
        List<BookShelf> list = new ArrayList<BookShelf>();
        list = bookShelfService.queryBookShelf(bookShelf);
        list.forEach((p)->System.out.println(p));
        return list.toString();
    }
    @PutMapping("/updateBookShelf")
    public String updateBookShelf(BookShelf bookShelf){
        int n = bookShelfService.updateBookShelf(bookShelf);

//        BookShelf bookshelf2 = new BookShelf();
//        bookshelf2.setBookshelfID("1");
//        BookShelf bookshelf1 = bookShelfService.queryBookShelf(bookshelf2).get(0);
//        StringBuilder sb = new StringBuilder();
//        sb.append(bookShelf.toString()+"   "+bookshelf1.toString());
        return "";
    }


    @DeleteMapping("/deleteBookShelf")
    public String deleteBookShelf(String delitems){
        try {
            String[] strs = delitems.split(",");
            int length = strs.length;
            Map<String, Object> map = new HashMap<String, Object>(1);

            if (length == 0) {
                map.put("num", 0);
            } else {
                int num = bookShelfService.deleteBookShelf(strs);
                map.put("num", num);
                return String.valueOf(num);
            }
        }catch (Exception e ){
        }
        return String.valueOf(0);
    }

}
