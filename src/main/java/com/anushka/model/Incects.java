package com.anushka.model;

public class Incects extends Animal {
    private int ageInWeeks;

    public int getAgeInWeeks() {
        return ageInWeeks;
    }

    public void setAgeInWeeks(int ageInWeeks) {
        this.ageInWeeks = ageInWeeks;
    }

    public static Incects determineType(int age){
        if(age>4){
            return new Butterfly();
        }else {
            return new Caterpillar();
        }
    }
}
