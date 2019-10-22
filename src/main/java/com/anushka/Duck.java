package com.anushka;

import com.anushka.model.Bird;

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
