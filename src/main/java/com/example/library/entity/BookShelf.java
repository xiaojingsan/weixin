package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode
public class BookShelf {
    /**
     * 书架编号
     * */
    private String bookshelfID;
    /**
     * 书架名
     * */
    private String bookshelfName;
}
