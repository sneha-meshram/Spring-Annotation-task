package com.stackroute;

import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actors;
import com.stackroute.domain.ConfigClass;
import com.stackroute.domain.Movie;
import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class MovieDemo {

    public static void main(String[] args){
        //instance of interface IOC class

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
       // Movie movie1=(Movie) context.getBean("act");
        Movie movie1=context.getBean("movie1",Movie.class);
        System.out.println(movie1.getActors());

//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//       // Actors actors=context.getBean("actors",Actors.class);
//        Movie movie1=context.getBean("movie1",Movie.class);
//        System.out.println(movie1.getActors());
//
//
//        //calling method for BeanLifecycleDemoBean class.
//        ConfigurableApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
//        BeanLifecycleDemoBean demoBean=(BeanLifecycleDemoBean) context1.getBean("beanLifecycleDemoBean");
//
//        //calling method of BeanPostProcessor class.
//        BeanPostProcessor beanPostProcessor=context1.getBean("beanPostProcessorDemoBean", BeanPostProcessorDemoBean.class);






    }
}
