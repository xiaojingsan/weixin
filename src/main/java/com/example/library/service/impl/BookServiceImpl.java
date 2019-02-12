package com.example.library.service.impl;

import com.example.library.entity.Book;
import com.example.library.mapper.BookMapper;
import com.example.library.service.BookService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    public BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public List showdata() {
        return bookMapper.showdata();
    }

    @Override
    public Book selectBookByID(String bookID) {
        return bookMapper.selectBookByID(bookID);
    }

    @Override
    public List<Book> selectBook(String bookName) {
        return bookMapper.selectBook(bookName);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int deleteBook(String bookID) {
        return bookMapper.deleteBook(bookID);
    }

    @Override
    public List<Book> searchBook() {
        return bookMapper.searchBook();
    }

    @Override
    public List showdata1() {
        return bookMapper.showdata1();
    }

}
