package com.anushka.model;

public class ClownFish extends Fish {
    public ClownFish() {
        setSize("small");
        setColor("orange");
    }

    public void joke() {
        System.out.println("I am Joking");
    }
}
