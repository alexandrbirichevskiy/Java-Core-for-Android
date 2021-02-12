package com.alexbirichevskiy.homework_8;

public class Human implements Actble {
    private final String type = "человек ";
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Я " + type + this.name + " и я" + jumping);
    }

    @Override
    public void run() {
        System.out.println("Я " + type + this.name + " и я" + running);
    }
}
