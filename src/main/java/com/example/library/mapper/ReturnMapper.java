package com.example.library.mapper;

import com.example.library.entity.Return;
import java.util.List;


public interface ReturnMapper {
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
