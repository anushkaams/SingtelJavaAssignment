package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CanSwim;

public class Dolphin extends Animal{
    public Dolphin() {
       setSwimable(new CanSwim());
    }
}
