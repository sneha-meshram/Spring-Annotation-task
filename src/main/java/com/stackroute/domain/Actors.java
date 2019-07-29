package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Actors {

    private String name;

    private String gender;

    private int age;


    //inject the object dependency implicitly.
    @Autowired
    public Actors(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }






//    //creating getter and setter
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    @Override
    public String toString() {
        return "Actors{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
