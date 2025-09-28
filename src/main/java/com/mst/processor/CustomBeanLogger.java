package com.mst.processor;

import com.mst.beans.Customer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanLogger implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(isCustomer(bean)){
            System.out.println("Before Initialization : " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        if(isCustomer(bean)){
            System.out.println("After Initialization : " + beanName);
        }
        return bean;
    }

    private boolean isCustomer(Object bean) {
        return bean instanceof Customer;
    }
}
