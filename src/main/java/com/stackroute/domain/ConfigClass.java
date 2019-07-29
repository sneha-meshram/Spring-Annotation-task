package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
  @Scope("prototype")

    public Movie movie1(){
        Movie movie1=new Movie();
        movie1.setActors(actor());
        return movie1;
    }

    @Bean
    public Actors actor() {
        Actors actors = new Actors("salman","male",25);

        return actors;
    }

    @Bean
    public Actors actors1() {

        Actors actors1 = new Actors("shahrukh","male",45);
        return actors1;
    }
    @Bean
    public Actors actors2() {

        Actors actors2 = new Actors("aamir","male",65);
        return actors2;
    }




}
