package com.anushka.model;

/**
 * Duck model class
 */
public class Duck extends Bird {
    @Override
    public String sing() {
        return "Quack, quack";
    }

    public void swim(){
        System.out.println("I am swimming");
    }
}
