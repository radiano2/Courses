package com.company;

import java.util.Scanner;

public class Main extends Subclass {

    public static void main(String[] args) {
        Subclass subclass_object = new Subclass();
        Scanner scan = new Scanner(System.in);
        subclass_object.menu();


        String scan_var = scan.nextLine();
        switch (scan_var) {
            case "1":
                System.out.println("enter season");
                Subclass.scan_check_string = scan.nextLine();
                subclass_object.check_season();
            case "2":
                System.out.println("enter your season");
                System.out.println("Summer");
                System.out.println("Winter");
                System.out.println("Autumn");
                System.out.println("Spring");
                Subclass.scan_check_string = scan.nextLine();
                subclass_object.similar_month();
            case "3":
                System.out.println("Enter numbers of days");
                Subclass.scan_check_int = Integer.parseInt(scan.nextLine());
                subclass_object.equal_days();
            case "4":
                System.out.println("Enter number of days");
                subclass_object.less_days();
            case "5":
                System.out.println("Enter number of days");
                subclass_object.more_days();
            case "6":
                System.out.println("enter your season");
                System.out.println("Summer [1]");
                System.out.println("Winter [2]");
                System.out.println("Autumn [3]");
                System.out.println("Spring [4]");
                Subclass.scan_check_int = Integer.parseInt(scan.nextLine());
                subclass_object.nextseason();
            case "7":
                System.out.println("enter your season");
                System.out.println("Summer");
                System.out.println("Winter");
                System.out.println("Autumn");
                System.out.println("Spring");
                Subclass.scan_check_int = Integer.parseInt(scan.nextLine());
                subclass_object.previousseason();
            case "8":
                System.out.println("Press enter to show moths with odd number of days");
                Subclass.scan_check_string = scan.nextLine(); //Just kostyl to press enter
                subclass_object.evendays();
            case "9":
                System.out.println("Press enter to show moths with even number of days");
                Subclass.scan_check_string = scan.nextLine(); //Just kostyl to press enter
                subclass_object.odddays();
            case "10":



            default:
                System.out.println("there is no such variant");
        }


    }


}










