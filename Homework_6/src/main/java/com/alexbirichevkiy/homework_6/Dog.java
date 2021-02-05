package com.alexbirichevkiy.homework_6;

public class Dog extends Animal {
    private int maxRun = 500;
    private int maxSwim = 10;
    private String form = "собака";

    public Dog(String name) {
        super(name);
        numberDogs++;
    }

    protected void run(double obstacleLength) {
        super.run(obstacleLength, maxRun, form);
    }

    protected void swim ( double obstacleLength){
        super.swim(obstacleLength, maxSwim, form);
    }


}
