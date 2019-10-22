package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CannotFly;
import com.anushka.model.behaviour.behaviourimpl.Cluck;

/**
 * Chicken model class
 */

public class Chicken extends Bird {
    public Chicken(){
        setSingable(new Cluck());
        setFlyable(new CannotFly());
    }
}
