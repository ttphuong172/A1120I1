package com.example.register.validate;

import com.example.register.dao.UserRepository;
import com.example.register.model.User;
import com.example.register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;


public class EmailValidator implements ConstraintValidator<EmailConstaint, String> {
    @Autowired
    private UserService userService;

    @Autowired
    UserRepository userRepository;
    @Override
    public void initialize(EmailConstaint constraintAnnotation) {
        constraintAnnotation.message();
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
//            return true;
//            Do cái findByEmail nó null a
//        Nó phải là findBYNameEmail. vì lúc này email chưa được tạo.
        List<User> list = userService.selectAllUser();
        List<String> listEmail = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listEmail.add(list.get(i).getEmail());
        }
        return !listEmail.contains(email);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getEmail().equals(email)) {
//                return false;
//            }
//        }
//        return true;
    }

}
