package com.alexbirichevskiy.homework_11.task_3;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Apple apple = new Apple(5);
        Orange orange = new Orange(10);
        Apple apple1 = new Apple(14);
        box1.putInBox(apple);
//        box1.infoBox();
        box1.putInBox(apple1);
        box1.getWeight();
//        box1.infoBox();
    }
}
