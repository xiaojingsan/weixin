package com.example.library.service.impl;

import com.example.library.entity.BookShelf;
import com.example.library.mapper.BookShelfMapper;
import com.example.library.mapper.UserMapper;
import com.example.library.service.BookService;
import com.example.library.service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("bookShelfService")
public class BookShelfServiceImpl implements BookShelfService{
    @Autowired
    private BookShelfMapper bookShelfMapper;
    @Override
    public int addBookShelf(BookShelf bookShelf) {
        return bookShelfMapper.addBookShelf(bookShelf);
    }

    @Override
    public List<BookShelf> queryAll() {
        return bookShelfMapper.queryAll();
    }

    @Override
    public List<BookShelf> queryBookShelf(BookShelf bookShelf) {
        return bookShelfMapper.queryBookShelf(bookShelf);
    }

    @Override
    public int deleteBookShelf(String[] id) {
        return bookShelfMapper.deleteBookShelf(id);
    }

    @Override
    public int updateBookShelf(BookShelf bookShelf) {
        return bookShelfMapper.updateBookShelf(bookShelf);
    }
}
