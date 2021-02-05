package com.alexbirichevkiy.homework_6;

public class Animal extends Main{
    private String name;

    public Animal(String name) {
        this.name = name;
        super.numberAnimals++;
    }

    protected void run(double obstacleLength, int max, String form) {
        if (obstacleLength <= max) {
            System.out.println(name + " пробежал " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не может столько пробежать, потому что он " + form);
        }
    }

    protected void swim ( double obstacleLength, int max, String form){
        if (obstacleLength <= max) {
            System.out.println(name + " проплыл " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не может столько проплыть, потому что он " + form);
        }
    }
}