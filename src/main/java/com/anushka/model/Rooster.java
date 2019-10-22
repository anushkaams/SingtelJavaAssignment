package com.anushka.model;

/**
 * Rooster model class, Rooster is-A Chicken
 */
public class Rooster extends Chicken{
    @Override
    public String sing() {
        return "Cock-a-doodle-doo";
    }
}
