package com.anushka.model;

import com.anushka.model.behaviour.Swimable;
import com.anushka.model.behaviour.behaviourimpl.CanSwim;

public class Dolphin {
    private Swimable swimable;

    public Swimable getSwimable() {
        return swimable;
    }

    public void setSwimable(Swimable swimable) {
        this.swimable = swimable;
    }

    public Dolphin() {
        swimable = new CanSwim();
    }
}
