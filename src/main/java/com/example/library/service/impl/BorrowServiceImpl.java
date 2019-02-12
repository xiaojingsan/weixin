package com.example.library.service.impl;


import com.example.library.entity.Borrow;
import com.example.library.mapper.BorrowMapper;
import com.example.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.library.entity.BorrowCount;

@Service("borrowService")
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    BorrowMapper borrowMapper;

    @Override
    public int addBorrowRecord(Borrow borrow) {
       return borrowMapper.addBorrowRecord(borrow);
    }

    @Override
    public List<Borrow> findAllBorrowRecords() {
        return borrowMapper.findAllBorrowRecords();
    }

    @Override
    public List<Borrow> queryBorrowRecords(Borrow borrow) {
        return borrowMapper.queryBorrowRecords(borrow);
    }

    @Override
    public int updateBorrowRecord(Borrow borrow) {
        return borrowMapper.updateBorrowRecord(borrow);
    }

    @Override
    public Borrow queryBorrowRecordsByBookID(String bookID) {
        return borrowMapper.queryBorrowRecordsByBookID(bookID);
    }

    @Override
    public String[] queryBookNameCount() {
        return borrowMapper.queryBookNameCount();
    }

    @Override
    public int[] queryBookCount() {
        return borrowMapper.queryBookCount();
    }

}
