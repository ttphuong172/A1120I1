package com.example.form.Validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinAgeValidator implements ConstraintValidator<MinAgeConstaint,Integer> {
    @Override
    public void initialize(MinAgeConstaint constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {
//        return (age>18 & age <60);
        if(age>18){
            return true;
        }
        return false;
    }
}
