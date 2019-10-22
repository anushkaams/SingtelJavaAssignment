package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CockADoodleDoo;

/**
 * Rooster model class, Rooster is-A Chicken
 */
public class Rooster extends Chicken{
    public Rooster(){
        setSingable(new CockADoodleDoo());
    }
}
