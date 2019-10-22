package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CanWalk;
import com.anushka.model.behaviour.behaviourimpl.CannotFly;

public class Caterpillar extends Incects{
    public Caterpillar(){
        setFlyable(new CannotFly());
        setWalkable(new CanWalk());
    }
}
