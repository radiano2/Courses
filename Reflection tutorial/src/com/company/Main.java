package com.company;
import java.lang.reflect.*;
import java.lang.Class;


public class Main {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {


        Person person = new Person();
        System.out.println(person);

        Class obj = person.getClass();
        Field field = obj.getDeclaredField("name");
        Field field1 = obj.getDeclaredField("age");
        field.setAccessible(true);
        field1.setAccessible(true);
        field.set(person,"NAME2");
        field1.set(person,60);

        System.out.println(person);


    }
}
