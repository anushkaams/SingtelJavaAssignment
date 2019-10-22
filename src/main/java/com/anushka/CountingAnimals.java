package com.anushka;

import com.anushka.model.Animal;
import com.anushka.model.Bird;
import com.anushka.model.Butterfly;
import com.anushka.model.Cat;
import com.anushka.model.Chicken;
import com.anushka.model.ClownFish;
import com.anushka.model.Dog;
import com.anushka.model.Dolphin;
import com.anushka.model.Duck;
import com.anushka.model.Fish;
import com.anushka.model.Parrot;
import com.anushka.model.Rooster;
import com.anushka.model.Shark;
import com.anushka.model.behaviour.behaviourimpl.CanFly;
import com.anushka.model.behaviour.behaviourimpl.CanSing;
import com.anushka.model.behaviour.behaviourimpl.CanSwim;
import com.anushka.model.behaviour.behaviourimpl.CanWalk;

public class CountingAnimals {


    public static void main(String[] args) {

        int canFly = 0, canWalk = 0, canSing = 0, canSwim = 0;

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Cat()),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };


        for (Animal animal : animals) {
            if (animal.getFlyable() instanceof CanFly) {
                canFly++;
            }
            if (animal.getWalkable() instanceof CanWalk) {
                canWalk++;
            }
            if (animal.getSingable() instanceof CanSing) {
                canSing++;
            }
            if (animal.getSwimable() instanceof CanSwim) {
                canSwim++;
            }
        }

        System.out.println(canFly + " Animals can Fly");
        System.out.println(canWalk + " Animals can Walk");
        System.out.println(canSing + " Animals can Sing");
        System.out.println(canSwim + " Animals can Swim");
    }


}
