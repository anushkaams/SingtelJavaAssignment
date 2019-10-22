package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.Quack;

/**
 * Duck model class
 */
public class Duck extends Bird {
    public Duck(){
        setSingable(new Quack());
    }

    public void swim(){
        System.out.println("I am swimming");
    }
}
