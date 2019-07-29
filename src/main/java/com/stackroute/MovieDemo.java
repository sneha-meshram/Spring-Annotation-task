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

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

     //   Movie movie1=context.getBean("movie1",Movie.class);
      //  Movie movie2=context.getBean("movie1",Movie.class);
      //  System.out.println(movie1.getActors());
     //   System.out.println(movie1==movie2);

     //   Actors actor=context.getBean("actor",Actors.class);
     //   System.out.println(actor);

      //  Actors actors1=context.getBean("actors1",Actors.class);
      //  System.out.println(actors1);

     //   Actors actors2=context.getBean("actors2",Actors.class);
      //  System.out.println(actors2);
     //   System.out.println(actors1==actors2);

     //   ConfigurableApplicationContext context1=new AnnotationConfigApplicationContext(ConfigClass.class);
        BeanLifecycleDemoBean demoBean=(BeanLifecycleDemoBean) context.getBean("beanLifecycleDemoBean");

        BeanPostProcessor demoBean1=context.getBean("beanPostProcessor", BeanPostProcessorDemoBean.class);

        context.close();






//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//       // Actors actors=context.getBean("actors",Actors.class);
//        Movie movie1=context.getBean("movie1",Movie.class);
//        System.out.println(movie1.getActors());
//
//
//        //calling method for BeanLifecycleDemoBean class.

//        //calling method of BeanPostProcessor class.
//        BeanPostProcessor beanPostProcessor=context1.getBean("beanPostProcessorDemoBean", BeanPostProcessorDemoBean.class);

    }
}
