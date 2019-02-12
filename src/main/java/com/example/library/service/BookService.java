package com.example.library.service;

import com.example.library.entity.Book;

import java.util.List;

public interface BookService {
    /**
     * 添加图书
     */
    int addBook(Book book);
    /**
     * 查找所有图书
     */
    List showdata();
    List<Book> searchBook();
    List showdata1();
    /**
     * 根据书名查找图书
     */
    List<Book> selectBook(String bookName);
    /**
     * 根据书id查找图书
     */
    Book selectBookByID(String bookID);
    /**
     * 修改图书信息
     */
    int updateBook(Book book);
    /**
     * 删除图书信息
     */
    int deleteBook(String bookID);
}
