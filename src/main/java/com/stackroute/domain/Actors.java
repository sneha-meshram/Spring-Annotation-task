package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actors {

    @Value("sneha")
    private String name;
    @Value("female")
    private String gender;
    @Value("23")
    private int age;


    //creating getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
