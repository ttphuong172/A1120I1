package com.example.casestudy.dao;

import com.example.casestudy.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender,Integer> {
}
