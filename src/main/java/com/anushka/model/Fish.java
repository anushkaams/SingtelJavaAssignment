package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CanSwim;
import com.anushka.model.behaviour.behaviourimpl.CannotSing;
import com.anushka.model.behaviour.behaviourimpl.CannotWalk;

public class Fish extends Animal{

    private String size;
    private String color;

    public Fish(){
        setSwimable(new CanSwim());
        setSingable(new CannotSing());
        setWalkable(new CannotWalk());
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
