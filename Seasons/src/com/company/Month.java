package com.company;


import java.util.Arrays;
import java.util.stream.Stream;

public enum Month {


    january(Season.SPRING, 31),
    february(Season.SPRING, 28),
    march(Season.SUMMER, 31),
    april(Season.SUMMER, 30),
    may(Season.SUMMER, 31),
    june(Season.AUTUMN, 30),
    july(Season.AUTUMN, 31),
    august(Season.AUTUMN, 31),
    september(Season.WINTER, 30),
    october(Season.WINTER, 31),
    november(Season.WINTER, 30),
    december(Season.SPRING, 31);

    public Season getSeason_name() {
        return season_name;
    }

    public Season season_name;
    public int number_of_days;

    Month(Season season_name, int number_of_days) {
        this.season_name = season_name;
        this.number_of_days = number_of_days;
    }



//    @Override
//    public String toString(){
//        return String.format("Season[name=%s, days=%d, season=%s]", this.name(), this.number_of_days, this.getSeason_name().toString());
//    }

    @Override
    public String toString(){
        return String.format(this.getSeason_name().toString());
    }
}
