package com.naumov.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("javabrains/javabrains.xml");
        context.registerShutdownHook();
        Triangle triangle = context.getBean("triangle", Triangle.class);
        System.out.println("--- Container is up, the bean \"triangle\" is " + triangle);

        String message = context.getMessage("greeting", null, "def", null);
        System.out.println("--- Message from the MessageSource: \"" + message + "\"");
    }
}
