package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.entity.BookShelf;
import com.example.library.entity.Position;
import com.example.library.service.BookService;
import com.example.library.service.BookShelfService;
import com.example.library.service.PositionService;
import javafx.geometry.Pos;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;
    @Autowired
    private BookService bookService;


    /**
     * 添加位置信息首先要知道该书是否已经存在位置
     *
     * */
    @PostMapping("/addPosition")
    public String addPosition(Position position) {
        position.setPositionID(UUID.randomUUID().toString());

        boolean flag = isPositionExist(position.getBookID());
        int n = 0;
        if(flag){
            positionService.addPosition(position);
        }else{

        }
        return String.valueOf(n);

    }

    public boolean isPositionExist(String bookID) {

        Book b =  bookService.selectBookByID(bookID);
        Position p = new Position();
        p.setBookID(b.getBookID());
        p.setPositionID(null);
        List<Position> list = positionService.queryPosition(p);
        if(list.size() > 0){
            System.out.println("该图书已经有位置了");
            return false;
        }else{
            return true;
        }

    }


    @GetMapping("/queryAll")
    public String queryAll(){
        List<Position> list = new ArrayList<Position>();
        list = positionService.queryAll();
        list.forEach((p)->System.out.println(p));
        return list.toString();
    }
    @PostMapping("/queryPosition")
    public String queryPosition(Position position){
        System.out.println("--------------------");
        position.setPositionID(null);
        List<Position> list = new ArrayList<Position>();
        list = positionService.queryPosition(position);
        list.forEach((p)->System.out.println(p));
        return list.toString();
    }
    @PutMapping("/updateBookShelf")
    public String updatePosition(Position position){
        int n = positionService.updatePosition(position);

//        BookShelf bookshelf2 = new BookShelf();
//        bookshelf2.setBookshelfID("1");
//        BookShelf bookshelf1 = bookShelfService.queryBookShelf(bookshelf2).get(0);
//        StringBuilder sb = new StringBuilder();
//        sb.append(bookShelf.toString()+"   "+bookshelf1.toString());
        return "";
    }


    @DeleteMapping("/deletePosition")
    public String deletePosition(String delitems){
        try {
            String[] strs = delitems.split(",");
            int length = strs.length;
            Map<String, Object> map = new HashMap<String, Object>(1);

            if (length == 0) {
                map.put("num", 0);
            } else {
                int num = positionService.deletePosition(strs);
                map.put("num", num);
                return String.valueOf(num);
            }
        }catch (Exception e ){
        }
        return String.valueOf(0);
    }
    @DeleteMapping("/deletePositionById")
    public String deletePositionById(Position position){
       int n =  positionService.deletePositionById(position);
        return String.valueOf(n);
    }


}
