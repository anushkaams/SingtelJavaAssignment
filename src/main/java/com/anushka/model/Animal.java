package com.anushka.model;

import com.anushka.model.behaviour.Flyable;
import com.anushka.model.behaviour.Singable;

/**
 * Animal model class
 */

public abstract class Animal {

    private Flyable flyable;
    private Singable singable;


    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Singable getSingable() {
        return singable;
    }

    public void setSingable(Singable singable) {
        this.singable = singable;
    }

    public void walk(){
        System.out.println("I am walking");
    }
}
