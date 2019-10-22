package com.anushka.model;

import com.anushka.model.behaviour.Flyable;
import com.anushka.model.behaviour.Singable;
import com.anushka.model.behaviour.Swimable;
import com.anushka.model.behaviour.Walkable;

/**
 * Animal model class
 */

public abstract class Animal {

    private Flyable flyable;
    private Singable singable;
    private Swimable swimable;
    private Walkable walkable;


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

    public Swimable getSwimable() {
        return swimable;
    }

    public void setSwimable(Swimable swimable) {
        this.swimable = swimable;
    }

    public Walkable getWalkable() {
        return walkable;
    }

    public void setWalkable(Walkable walkable) {
        this.walkable = walkable;
    }
}
