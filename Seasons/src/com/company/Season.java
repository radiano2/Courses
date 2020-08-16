package com.company;

public enum Season {
    SUMMER("summer", "Summer"),
    AUTUMN("autumn", "Autumn"),
    WINTER("winter", "Winter"),
    SPRING("spring", "Spring");

    private String just_name;
    private String camel_just_name;

    Season(String just_name, String camel_just_name) {
        this.just_name = just_name;
        this.camel_just_name = camel_just_name;
    }


}

