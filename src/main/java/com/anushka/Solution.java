package com.anushka;

import com.anushka.model.Bird;
import com.anushka.model.Chicken;
import com.anushka.model.Duck;
import com.anushka.model.Rooster;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();

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

    }
}
