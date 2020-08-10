package com.company;

public class Calculator implements Numerable {
    @Override
    public void divide() {
        System.out.println(15 / 3);
    }

    @Override
    public void minus() {
        System.out.println(15 - 3);
    }

    @Override
    public void multiply() {
        System.out.println(15 * 3);
    }

    @Override
    public void plus() {
        System.out.println(15 + 3);
    }
}
