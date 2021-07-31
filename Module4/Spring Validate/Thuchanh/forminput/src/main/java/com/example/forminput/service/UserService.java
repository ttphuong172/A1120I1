package com.example.forminput.service;

import com.example.forminput.model.User;

import java.util.List;

public interface UserService {
    List<User> selectAllUser();
    void saveUser(User user);
}
