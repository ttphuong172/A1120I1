package com.example.flower.service;

import com.example.flower.model.Flower;

import java.util.List;

public interface FlowerService {
    List<Flower> selectAllFlower();
    Flower findFlowerById(int id);
}
