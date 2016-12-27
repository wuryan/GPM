package org.wentu.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by wuguo on 2016/12/25.
 */
public class LifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware{

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
