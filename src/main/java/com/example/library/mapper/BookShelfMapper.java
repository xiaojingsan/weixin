package com.example.library.mapper;

import com.example.library.entity.BookShelf;
import com.example.library.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookShelfMapper {

    /**
     *添加书架
     * @param bookShelf
     * @return
     */
    public int addBookShelf(BookShelf bookShelf);

    /**
     * 查询所有书架
     * @return
     */
    public List<BookShelf> queryAll();

    /**
     * 按照添加查询书架
     * @param bookShelf
     * @return
     */
    public List<BookShelf> queryBookShelf(BookShelf bookShelf);

    /**
     * 根据id批量删除书架
     * @param id
     * @return
     */
    public int deleteBookShelf(String[] id);


    /**
     * 更新书架信息
     */
    public int updateBookShelf(BookShelf bookShelf);

}
