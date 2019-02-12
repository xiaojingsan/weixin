package com.example.library.mapper;

import com.example.library.entity.BookShelf;
import com.example.library.entity.Position;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PositionMapper {

    /**
     *添加位置
     * @param position
     * @return
     */
    public int addPosition(Position position);

    /**
     * 查询所有图书位置
     * @return
     */
    public List<Position> queryAll();

    /**
     * 按照添加查询位置
     * @param position
     * @return
     */
    public List<Position> queryPosition(Position position);

    /**
     * 根据id批量删除位置
     * @param id
     * @return
     */
    public int deletePosition(String[] id);

    /**
     * 根据ID删除一条位置信息
     * @param position
     * */
    public int deletePositionById(Position position);
    /**
     * 更新位置信息
     */
    public int updatePosition(Position position);

}
