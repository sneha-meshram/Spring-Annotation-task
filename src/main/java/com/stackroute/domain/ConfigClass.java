package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
    public Movie movie1(){
        Movie movie1=new Movie();
        movie1.setActors(actor());
        return movie1;
    }
    @Bean
    public Actors actor(){
        Actors actors= new Actors();

        return new Actors();
    }

}
