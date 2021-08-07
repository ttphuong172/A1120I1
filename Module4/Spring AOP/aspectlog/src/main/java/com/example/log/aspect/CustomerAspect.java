package com.example.log.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;


@Aspect
@Component
public class CustomerAspect {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

   @AfterThrowing("execution(* com.example.log.service.CustomerServiceImpl.*(..))")
    public void log(JoinPoint joinPoint){
       String method = joinPoint.getSignature().getName();

       System.out.println(method);
//       logger.error("ABC"+ method);
   }
}
