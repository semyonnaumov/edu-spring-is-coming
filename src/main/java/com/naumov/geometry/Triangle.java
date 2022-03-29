package com.naumov.geometry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
    private Point pointA, pointB, pointC;
    private ApplicationContext context;
    private String beanName;

    public Point getPointA() {
        return pointA;
    }

    @Resource
    @Qualifier("pointAA")
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
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
