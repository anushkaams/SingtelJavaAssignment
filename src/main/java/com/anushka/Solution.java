package com.anushka;

import com.anushka.model.Animal;
import com.anushka.model.Bird;
import com.anushka.model.Butterfly;
import com.anushka.model.Cat;
import com.anushka.model.Chicken;
import com.anushka.model.Dog;
import com.anushka.model.Duck;
import com.anushka.model.Fish;
import com.anushka.model.Incects;
import com.anushka.model.Parrot;
import com.anushka.model.Rooster;

public class Solution {
    public static void main(String[] args) {
        System.out.println("------------------");

        Duck duck = new Duck();
        System.out.println(duck.getSingable().sing());
        duck.swim();

        System.out.println("------------------");

        Bird chicken = new Chicken();
        System.out.println(chicken.getSingable().sing());
        chicken.getFlyable().fly();

        System.out.println("------------------");

        Bird rooster = new Rooster();
        System.out.println(rooster.getSingable().sing());
        rooster.getFlyable().fly();

        System.out.println("------------------");

        //Parrot Living near Dog
        Bird parrot1 = new Parrot(new Dog());
        //Parrot Living near Cat
        Bird parrot2 = new Parrot(new Cat());
        //Parrot Living near Rooster
        Bird parrot3 = new Parrot(new Rooster());
        //Parrot Living near Duck
        Bird parrot4 = new Parrot(new Duck());

        System.out.println(parrot1.getSingable().sing());
        System.out.println(parrot2.getSingable().sing());
        System.out.println(parrot3.getSingable().sing());
        System.out.println(parrot4.getSingable().sing());

        System.out.println("------------------");
        Fish fish = new Fish();
        fish.getSwimable().swim();
        fish.getWalkable().walk();
        System.out.println(fish.getSingable().sing());

        System.out.println("------------------");

        Animal butterfly = new Butterfly();
        butterfly.getFlyable().fly();
        System.out.println(butterfly.getSingable().sing());

        System.out.println("------------------");
        System.out.println("metamorphosis from caterpillar to butterfly");

        Incects incects1 = Incects.determineType(5);
        incects1.getFlyable().fly();

        Incects incects2 = Incects.determineType(2);
        incects2.getFlyable().fly();




    }
}
