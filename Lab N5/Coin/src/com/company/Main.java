package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    String coin_toss = new Random().nextBoolean() ? "eagle" : "number";
        System.out.println(coin_toss);
    }
}
