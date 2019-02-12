package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class BorrowCount {
    private String bookName;
    private int borrowCount;
}
