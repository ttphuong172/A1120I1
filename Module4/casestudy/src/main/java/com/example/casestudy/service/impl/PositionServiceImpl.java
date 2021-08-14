package com.example.casestudy.service.impl;

import com.example.casestudy.dao.PositionRepository;
import com.example.casestudy.model.Position;
import com.example.casestudy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
@Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> selectAllPosition() {
        return positionRepository.findAll();
    }
}
