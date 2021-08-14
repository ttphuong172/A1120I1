package com.example.flower.dao;

import com.example.flower.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface FlowerRepository extends JpaRepository<Flower,Integer> {
}
