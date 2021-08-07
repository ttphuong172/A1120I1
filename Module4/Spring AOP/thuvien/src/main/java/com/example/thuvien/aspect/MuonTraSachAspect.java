package com.example.thuvien.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MuonTraSachAspect {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @After("execution(* com.example.thuvien.controller.SachController.*(..))")
    public void log(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();

//        System.out.println(method);
       logger.error("Cac phuong thuc duoc goi:"+ method);
    }
}
