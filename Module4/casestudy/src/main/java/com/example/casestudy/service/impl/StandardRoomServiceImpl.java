package com.example.casestudy.service.impl;

import com.example.casestudy.dao.StandardRoomRepository;
import com.example.casestudy.model.StandardRoom;
import com.example.casestudy.service.StandardRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StandardRoomServiceImpl implements StandardRoomService {
    @Autowired
    private StandardRoomRepository standardRoomRepository;
    @Override
    public List<StandardRoom> selectAllStandardRoom() {
        return standardRoomRepository.findAll();
    }
}
