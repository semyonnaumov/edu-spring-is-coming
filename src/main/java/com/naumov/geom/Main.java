package com.naumov.geom;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle1 = factory.getBean("triangle1", Triangle.class);
        Triangle triangle2 = factory.getBean("triangle2", Triangle.class);
        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}
