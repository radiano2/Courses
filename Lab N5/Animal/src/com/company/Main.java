package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main extends Pet {

    public static void main(String[] args) {
        Cow cow_object = new Cow();
        Cat cat_object = new Cat();
        Dog dog_object = new Dog();

        System.out.println(cow_object.voice());
        System.out.println(cat_object.voice());
        System.out.println(dog_object.voice());
    }
}
