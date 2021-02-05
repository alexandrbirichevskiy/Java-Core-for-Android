package com.alexbirichevkiy.homework_6;

public class Cat extends Animal {
    private int maxRun = 200;
    private String form = "кот";

    public Cat(String name) {
        super(name);
        numberCats ++;
    }

    protected void run(double obstacleLength) {
        super.run(obstacleLength, maxRun, form);
    }

    protected void swim ( double obstacleLength){
        System.out.println("Я не умею плавать, я же кот!");
    }

}
