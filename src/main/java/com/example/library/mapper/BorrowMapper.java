package com.example.library.mapper;



import com.example.library.entity.Borrow;
import com.example.library.entity.User;
import com.example.library.entity.BorrowCount;

import java.util.List;


public interface BorrowMapper {

    /**
     * @param borrow
     * @return int
     *  添加借书记录
     * */
    int addBorrowRecord(Borrow borrow);
    /**
     *@return List
     * 查找所有借书记录
     * */
    List<Borrow> findAllBorrowRecords();
    /**
     * 查询借阅记录
     * @param borrow
     * @return
     */
     List<Borrow> queryBorrowRecords(Borrow borrow);

    /**
     * */
    //int deleteBorrowRecord(Borrow borrow);
    /**
     * @param borrow
     * @return int
     * 更新借书记录信息
     * */
     int updateBorrowRecord(Borrow borrow);
    /**
     * 根据bookID查询借阅记录
     * @param bookID
     * @return
     */
    Borrow queryBorrowRecordsByBookID(String bookID);

    String[]  queryBookNameCount();
    int[] queryBookCount();
}
