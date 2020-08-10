package com.company;

public class Subclass extends Plane implements Features {

    public Subclass(int length, int width, int height) {
        super(length, width, height);
    }

    public Subclass() {
        super();
    }

    @Override
    public void stealth() {
        System.out.println("the plane is invisible on this scale");
        System.out.println(rand.nextInt());

    }

    @Override
    public void turbo() {
        System.out.println("the turbo speed is");
        System.out.println(rand.nextInt(500 - 301) + 301);
    }

    @Override
    public void nuclear() {
        System.out.println("the amount of nuclear warheads is");
        System.out.println(rand.nextInt(10));
    }
}
