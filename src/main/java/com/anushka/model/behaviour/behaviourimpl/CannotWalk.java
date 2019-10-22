package com.anushka.model.behaviour.behaviourimpl;

import com.anushka.model.behaviour.Walkable;

public class CannotWalk implements Walkable {
    public void walk() {
        System.out.println("I can't walk");
    }
}
