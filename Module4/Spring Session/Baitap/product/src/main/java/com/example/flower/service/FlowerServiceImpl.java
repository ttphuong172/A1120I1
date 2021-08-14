package com.example.flower.service;

import com.example.flower.dao.FlowerRepository;
import com.example.flower.model.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerServiceImpl implements FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;
    @Override
    public List<Flower> selectAllFlower() {
        return flowerRepository.findAll();
    }

    @Override
    public Flower findFlowerById(int id) {
        return flowerRepository.findById(id).orElse(null);
    }
}
