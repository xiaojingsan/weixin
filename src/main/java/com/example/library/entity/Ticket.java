package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.UUID;

@Data
@EqualsAndHashCode
public class Ticket {
    /**
     * 罚款编号
     * */
    private String ticketID= UUID.randomUUID().toString();;
    /**
     * 用户编号
     * */
    private String userID;
    /**
     * 罚款金额
     * */
    private double ticketPrice;
    /**
     * 罚款原因
     * */
    private String ticketReason;
}
