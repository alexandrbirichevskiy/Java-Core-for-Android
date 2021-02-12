package com.alexbirichevskiy.homework_8;

public class Human implements Actble {
    private final String type = "человек ";
    private String name;
    private double limitRun;
    private double limitJump;

    public Human(String name, double limitRun, double limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public double jump() {
        System.out.println("Я " + type + this.name + " и я" + jumping);
        return limitJump;
    }

    @Override
    public double run() {
        System.out.println("Я " + type + this.name + " и я" + running);
        return limitRun;
    }
}
