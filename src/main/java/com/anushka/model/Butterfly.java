package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CanFly;
import com.anushka.model.behaviour.behaviourimpl.CannotSing;

public class Butterfly extends Incects{
    public Butterfly(){
        setFlyable(new CanFly());
        setSingable(new CannotSing());
    }
}
