package com.anushka.model.behaviour.behaviourimpl;

import com.anushka.model.behaviour.Flyable;

public class CannotFly implements Flyable {
    public void fly() {
        System.out.println("I can't fly");
    }
}
