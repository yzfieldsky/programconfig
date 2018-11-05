package com.test.core;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before(value = "execution(* com.test.core.OutputService+.*(..))")
    public void before() {
        System.out.println("win");
    }

}
