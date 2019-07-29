package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    //overriding the method of InitializingBean, DisposableBean Interface.

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("set the properties");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("properties detroy");
    }

    //customInit() created..
    @PostConstruct
    public void customInit(){
        System.out.println("customInit() is invoked or initialize..");
    }

    //customDestroy created.
    @PreDestroy
    public void customDestroy(){
        System.out.println("customDestroy() is invoked or initialize..");
    }
}
