package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CanFly;
import com.anushka.model.behaviour.behaviourimpl.CannotSing;

public class Butterfly extends Animal{
    public Butterfly(){
        setFlyable(new CanFly());
        setSingable(new CannotSing());
    }
}
