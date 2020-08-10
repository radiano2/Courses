package com.company;

public class Main extends Plane {

    public Main(int length, int width, int height) {
        super(length, width, height);
    }

    public static void main(String[] args) {
        SU27 su27_object = new SU27();

        su27_object.down();
        su27_object.left();
        su27_object.right();
        su27_object.up();

        Subclass subclass_object = new Subclass();
        subclass_object.engine_start();
        subclass_object.plane_start();
        subclass_object.plane_landing();

        subclass_object.stealth();
        subclass_object.nuclear();
        subclass_object.turbo();
    }
}
