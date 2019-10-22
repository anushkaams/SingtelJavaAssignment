package com.anushka.model;

public class Shark extends Fish {
    public Shark(){
        setSize("large");
        setColor("grey");
    }

    public void eat() {
        System.out.println("I am eating other fish");
    }
}
