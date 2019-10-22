package com.anushka;

import com.anushka.model.Bird;
import com.anushka.model.Chicken;
import com.anushka.model.Duck;
import com.anushka.model.Rooster;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println("------------------");

        Duck duck = new Duck();
        duck.sing();
        System.out.println(duck.sing());
        duck.swim();

        System.out.println("------------------");

        Bird chicken = new Chicken();
        chicken.sing();
        System.out.println(chicken.sing());
        chicken.fly();

        System.out.println("------------------");

        Bird rooster = new Rooster();
        System.out.println(rooster.sing());
        rooster.fly();

    }
}
