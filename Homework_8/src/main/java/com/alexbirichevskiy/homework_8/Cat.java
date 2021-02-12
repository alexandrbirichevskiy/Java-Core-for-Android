package com.alexbirichevskiy.homework_8;

public class Cat implements Actble {
    private final String type = "кот ";
    private String name;

    public Cat(String name) {
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
