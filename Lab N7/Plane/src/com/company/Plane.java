package com.company;

import java.util.Random;

public abstract class Plane {
    Random rand = new Random();

    public Plane() {

    }

    public void engine_start(){
        System.out.println("The plane is starting");
        System.out.println(rand.nextInt(80 - 20 )+20);
    }
    public void plane_start(){
        System.out.println("The fuel is");
        System.out.println(rand.nextInt(1000));
    }

    public void plane_landing(){
        System.out.println("The plane is landing");
    }

    public Plane(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int length = 15;
    int width = 7;
    int height = 3;

}
