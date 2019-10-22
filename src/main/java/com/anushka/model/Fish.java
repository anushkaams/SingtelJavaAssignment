package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CanSwim;
import com.anushka.model.behaviour.behaviourimpl.CannotSing;
import com.anushka.model.behaviour.behaviourimpl.CannotWalk;

public class Fish extends Animal{
    public Fish(){
        setSwimable(new CanSwim());
        setSingable(new CannotSing());
        setWalkable(new CannotWalk());
    }
}
