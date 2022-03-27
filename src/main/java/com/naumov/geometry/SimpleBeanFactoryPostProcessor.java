package com.naumov.geometry;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Arrays;

public class SimpleBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
             throws BeansException {
        System.out.println(Arrays.toString(beanFactory.getBeanDefinitionNames()));
    }
}
