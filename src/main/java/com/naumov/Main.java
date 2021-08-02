package com.naumov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean bean = context.getBean("someBean", TestBean.class);
        System.out.println(bean.getName());

        context.close();
    }
}
