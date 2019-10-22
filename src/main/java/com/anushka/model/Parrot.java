package com.anushka.model;

import com.anushka.model.behaviour.behaviourimpl.CockADoodleDoo;
import com.anushka.model.behaviour.behaviourimpl.Meow;
import com.anushka.model.behaviour.behaviourimpl.Quack;
import com.anushka.model.behaviour.behaviourimpl.Woof;

public class Parrot extends Bird{

    private Animal animal;

    public Parrot(Animal animal) {
        this.animal = animal;

        if(animal instanceof Dog) {
            setSingable(new Woof());
        }else if(animal instanceof Cat) {
            setSingable(new Meow());
        }else if(animal instanceof Rooster) {
            setSingable(new CockADoodleDoo());
        }else if(animal instanceof Duck) {
            setSingable(new Quack());
        }
    }

    public void setNebihourAnimal(Animal animal) {
        this.animal = animal;
    }
}
