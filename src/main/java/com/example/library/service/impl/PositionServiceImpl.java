package com.example.library.service.impl;

import com.example.library.entity.Position;
import com.example.library.mapper.PositionMapper;
import com.example.library.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    PositionMapper  positionMapper;
    @Override
    public int addPosition(Position position) {
        return positionMapper.addPosition(position);
    }

    @Override
    public List<Position> queryAll() {
        return positionMapper.queryAll();
    }

    @Override
    public List<Position> queryPosition(Position position) {
        return positionMapper.queryPosition(position);
    }

    @Override
    public int deletePosition(String[] id) {
        return positionMapper.deletePosition(id);
    }

    @Override
    public int deletePositionById(Position position) {
        return positionMapper.deletePositionById(position);
    }

    @Override
    public int updatePosition(Position position) {
        return positionMapper.updatePosition(position);
    }
}
