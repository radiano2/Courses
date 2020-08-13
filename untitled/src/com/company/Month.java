package com.company;


import java.util.Arrays;

public enum Month {


    january("spring", 31),
    february("spring", 28),
    march("summer", 31),
    april("summer", 30),
    may("summer", 31),
    june("autumn", 30),
    july("autumn", 31),
    august("autumn", 31),
    september("winter", 30),
    october("winter", 31),
    november("winter", 30),
    december("spring", 31);

    public String season_name;
    public int number_of_days;

    Month(String season_name, int number_of_days) {
        this.season_name = season_name;
        this.number_of_days = number_of_days;
    }

    public String getSeason_name() {
        return season_name;
    }

//    public int getNumber_of_days() {
//        return number_of_days;
//    }
//
//    public String getseason(){
//        return;
//    }
}
