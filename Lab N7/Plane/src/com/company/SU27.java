package com.company;

import java.util.Random;

public class SU27 {

    Random rand = new Random();
    public void max_speed(){

        System.out.println("the max speed is 300");
    }
    public void up() {
        System.out.println("up");
        System.out.println(rand.nextInt(100));
    }

    public void down() {
        System.out.println("down");
        System.out.println(rand.nextInt(100));
    }

    public void left() {
        System.out.println("left");
        System.out.println(rand.nextInt(100));
    }

    public void right() {
        System.out.println("right");
        System.out.println(rand.nextInt(100));
    }
}
