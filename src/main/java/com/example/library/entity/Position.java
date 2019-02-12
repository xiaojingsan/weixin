package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode
public class Position {
    /**
     * 位置ID
     * */
    private String positionID;
    /**
     * 图书编号
     * */
    private String bookID;
    /**
     * 书架编号
     * */
    private String bookshelfID;
}
