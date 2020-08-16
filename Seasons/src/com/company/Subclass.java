package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Subclass implements Check_season, Similar_month_f2,
        Equal_number_of_days, Menu, Less_days, More_days, Next_season , PreviousSeason
        ,Evendays,Odddays {


    static Scanner scan_check = new Scanner(System.in);
    static String scan_check_string = scan_check.nextLine();
    static int scan_check_int = scan_check.nextInt();
    static String scan_var_int = scan_check.nextLine();

    @Override
    public void check_season() {
        switch (scan_check_string) {
            case "winter", "Winter" -> {
                System.out.println("This month exist");
                System.out.println(Season.WINTER);
            }
            case "summer", "Summer" -> {
                System.out.println("This month exist");
                System.out.println(Season.SUMMER);
            }
            case "autumn", "Autumn" -> {
                System.out.println("This month exist");
                System.out.println(Season.AUTUMN);
            }
            case "spring", "Spring" -> {
                System.out.println("This month exist");
                System.out.println(Season.SPRING);
            }
            default -> System.out.println("Error");
        }
    }

    @Override
    public void similar_month() {
        switch (scan_check_string) {
            case "summer", "Summer":
                for (Month month_iterator : Month.values()) {
                    if (month_iterator.season_name.equals(Season.SUMMER)) {
                        System.out.println(month_iterator.name());
                    }
                }
            case "winter", "Winter":
                for (Month month_iterator : Month.values()) {
                    if (month_iterator.season_name.equals(Season.WINTER)) {
                        System.out.println(month_iterator.name());
                    }
                }
            case "autumn", "Autumn":
                for (Month month_iterator : Month.values()) {
                    if (month_iterator.season_name.equals(Season.AUTUMN)) {
                        System.out.println(month_iterator.name());
                    }
                }
            case "spring", "Spring":
                for (Month month_iterator : Month.values()) {
                    if (month_iterator.season_name.equals(Season.SPRING)) {
                        System.out.println(month_iterator.name());
                    }
                }
        }
    }

    @Override
    public void equal_days() {
        for (Month month_iterator : Month.values()) {
            if (month_iterator.number_of_days == scan_check_int) {
                System.out.println(Arrays.toString((new String[]{month_iterator.name()})));
            }
        }
    }

    @Override
    public void menu() {

        System.out.println("Choose your option using number");
        System.out.println("Check month existence                           [1]");
        System.out.println("Show all months of certain season               [2]");
        System.out.println("Show all months of certain amount of days       [3]");
        System.out.println("Show all months that have less days             [4]");
        System.out.println("Show all months that have more days             [5]");
        System.out.println("Show certain season                             [6]");
        System.out.println("Show previous season                            [7]");
        System.out.println("Show months that have even number of days       [8]");
        System.out.println("Show months that have odd number of days        [9]");
        System.out.println("Show , does this month has even number of days [10]");

    }

    @Override
    public void less_days() {
        for (Month month_iterator : Month.values()) {
            if (month_iterator.number_of_days < scan_check_int) {
                System.out.println(Arrays.toString((new String[]{month_iterator.name()})));
            }
        }
    }

    @Override
    public void more_days() {
        for (Month month_iterator : Month.values()) {
            if (month_iterator.number_of_days > scan_check_int) {
                System.out.println(Arrays.toString((new String[]{month_iterator.name()})));
            }
        }
    }

    @Override
    public void nextseason() {
        if (scan_check_int == 1) {
            System.out.println(Season.SPRING);
        }
        else if(scan_check_int == 4){
            System.out.println(Season.WINTER);
        }
        else if(scan_check_int == 2){
            System.out.println(Season.AUTUMN);
        }
        else if (scan_check_int == 3){
            System.out.println(Season.SUMMER);
        }
    }

    @Override
    public void previousseason() {
        if (scan_check_int == 1) {
            System.out.println(Season.AUTUMN);
        }
        else if(scan_check_int == 4){
            System.out.println(Season.SUMMER);
        }
        else if(scan_check_int == 2){
            System.out.println(Season.SPRING);
        }
        else if (scan_check_int == 3){
            System.out.println(Season.SUMMER);
        }

    }

    @Override
    public void evendays() {
        for(Month month_iterator : Month.values()){
            if (month_iterator.number_of_days % 2 == 0){
                System.out.println(month_iterator.name());
            }
        }
    }

    @Override
    public void odddays() {
        for(Month month_iterator : Month.values()){
            if (month_iterator.number_of_days % 2 != 0){
                System.out.println(month_iterator.name());
            }
        }

    }
}
