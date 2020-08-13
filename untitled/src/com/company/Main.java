package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("enter your month");
        Arrays.stream(Month.values()).filter(x -> Boolean.parseBoolean(x.season_name)).forEach(System.out::println);
    }


}



