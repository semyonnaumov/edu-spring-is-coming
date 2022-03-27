package com.naumov.geom;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Triangle triangle = context.getBean("triangle", Triangle.class);
        System.out.println("Container is up, the bean \"triangle\" is " + triangle);
    }
}
