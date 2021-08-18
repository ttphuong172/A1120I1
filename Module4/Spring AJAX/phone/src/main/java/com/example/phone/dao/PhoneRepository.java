package com.example.phone.dao;

import com.example.phone.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone,Integer> {
}
