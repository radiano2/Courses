package com.company;

//import java.lang.reflect.*;

public class Person {


    private String name = "Name";
    private int age = 40;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
