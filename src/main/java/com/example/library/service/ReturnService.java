package com.example.library.service;

import com.example.library.entity.Return;

import java.util.List;

public interface ReturnService {
    /**
     * @param returnBook
     * @return int
     *  添加还书记录
     * */
    int addReturnRecord(Return returnBook);
    /**
     *@return List
     * 查找所有还书记录
     * */
    List<Return> findAllReturnRecords();
    /**
     * 查询还书记录
     * @param returnBook
     * @return
     */
    List<Return> queryReturnRecords(Return returnBook);

    /**
     * @param returnBook
     * @return int
     * 更新还书记录信息
     * */
    int updateReturnRecord(Return returnBook);
}
