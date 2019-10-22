package com.anushka.model;

/**
 * Chicken model class
 */

public class Chicken extends Bird {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public String sing() {
        return "Cluck, cluck";
    }
}
