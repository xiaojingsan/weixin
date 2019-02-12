package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

@Data
@EqualsAndHashCode
public class Borrow {
    /**
     * 借阅编号
     * */
    private String borrowID;
    /**
     * 借阅图书ID
     * */
    private String bookID;
    private String bookName;
    private String bookType;
    /**
     * 借阅用户ID
     * */
    private String userID;
    private String userName;
    private String userNumber;
    /**
     * 借阅时间
     * */
    private Date borrowTime;
}
