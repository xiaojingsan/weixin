package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.UUID;

@Data
@EqualsAndHashCode
public class Book {

    /**
     * 图书编号
     * */
    private String bookID;
    /**
     * 图书名
     * */
    private String bookName;
    /**
     * 图书类型
     * */
    private String bookType;
    /**
     * 图书作者
     * */
    private String bookAuthor;
    /**
     * 图书出版社
     * */
    private String bookPublish;
    /**
     * 图书简介
     * */
    private String bookDescribe;
    /**
     * 图书价格
     * */
    private double bookPrice;
    /**
     * 入馆时间
     * */
    private Date bookEnterTime;
    /**
     * 图书数量
     * */
    private int bookNumber;
    /**
     * 图书状态
     * */
    private String bookStatus;

}
