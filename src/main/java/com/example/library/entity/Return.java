package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.UUID;

@Data
@EqualsAndHashCode
public class Return {
    /**
     * 归还编号
     * */
    private String returnID;
    /**
     * 归还图书ID
     * */
    private String bookID;
    private String bookName;
    private String bookType;
    /**
     * 归还用户ID
     * */
    private String userID;
    private String userName;
    private String userNumber;
    /**
     * 归还时间
     * */
    private Date returnTime;
    /**
     * 是否超期
     * */
    private String overTime;
}
