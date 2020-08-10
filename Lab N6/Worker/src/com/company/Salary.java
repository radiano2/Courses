package com.company;

public interface Salary{
    public void salary();
    default void methodName(){
        System.out.println("text");
    }

    default void methodName2(){
        System.out.println("text2");
    }
}
