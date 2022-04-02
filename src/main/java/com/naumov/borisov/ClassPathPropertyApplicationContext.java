package com.naumov.borisov;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class ClassPathPropertyApplicationContext extends GenericApplicationContext {
    public ClassPathPropertyApplicationContext(String fileName) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
        int i = reader.loadBeanDefinitions(fileName);
        this.refresh();
        System.out.println("Found " + i + " beans");
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathPropertyApplicationContext("borisov/context.properties");
        context.getBean(Quoter.class).sayQuote();
    }
}
