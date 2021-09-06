package com.example.casestudy.dao;

import com.example.casestudy.model.StandardRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StandardRoomRepository extends JpaRepository<StandardRoom,Integer> {
}
