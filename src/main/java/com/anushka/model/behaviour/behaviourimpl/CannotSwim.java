package com.anushka.model.behaviour.behaviourimpl;

import com.anushka.model.behaviour.Swimable;

public class CannotSwim implements Swimable {
    public void swim() {
        System.out.println("I can't swim");
    }
}
