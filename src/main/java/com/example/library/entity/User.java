package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;
/**
 * 用户类
 */
@Data
@EqualsAndHashCode
public class User {
    private String userID;
    private String userNumber;
    private String userName;
    private String userPassword;
    private String userSex;
    private String userDepartment;
    private String userPhone;
    private String userEmail;

}
