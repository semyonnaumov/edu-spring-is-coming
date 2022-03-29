package com.naumov.geometry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
    private Point pointA, pointB, pointC;
    private ApplicationContext context;
    private String beanName;
    private MessageSource messageSource;

    public Point getPointA() {
        return pointA;
    }

    @Autowired
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Autowired
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Autowired
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public String toString() {
        return "[" + pointA + " " + pointB + " " + pointC + "]";
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
        String message = messageSource.getMessage("greeting", null, "Default", null);
        System.out.println("afterPropertiesSet, greeting=" + message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @PostConstruct
    public void myInit() {
        System.out.println("myInit");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("myDestroy");
    }
}
