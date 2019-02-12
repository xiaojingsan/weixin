package com.example.library.service.impl;

import com.example.library.entity.Return;
import com.example.library.mapper.ReturnMapper;
import com.example.library.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReturnService")
public class ReturnServiceImpl implements ReturnService{
    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public int addReturnRecord(Return returnBook) {
        return returnMapper.addReturnRecord(returnBook);
    }

    @Override
    public List<Return> findAllReturnRecords() {
        return returnMapper.findAllReturnRecords();
    }

    @Override
    public List<Return> queryReturnRecords(Return returnBook) {
        return returnMapper.queryReturnRecords(returnBook);
    }

    @Override
    public int updateReturnRecord(Return returnBook) {
        return returnMapper.updateReturnRecord(returnBook);
    }
}
