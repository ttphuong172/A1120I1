package com.example.phone.service.Impl;

import com.example.phone.dao.PhoneRepository;
import com.example.phone.model.Phone;
import com.example.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;
    @Override
    public List<Phone> selectAllPhone() {
        return phoneRepository.findAll();
    }

    @Override
    public void savePhone(Phone phone) {
        phoneRepository.save(phone);
    }

    @Override
    public void deletePhone(int id) {
        Phone phone=phoneRepository.findById(id).orElse(null);
        phoneRepository.delete(phone);
    }

    @Override
    public Phone findPhoneById(int id) {
        return phoneRepository.findById(id).orElse(null);
    }
}
