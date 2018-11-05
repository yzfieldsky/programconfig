package com.test.core;

import com.test.core.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        OutputService service = (OutputService) context.getBean("outputService");
        service.say();
        OutputService service2 = (OutputService) context.getBean("outputService");
        service2.say();
        System.out.println();
    }
}
