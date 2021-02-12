package com.alexbirichevskiy.homework_8;

public class Main {
    public static void main(String[] args) {
        Actble cat = new Cat("Барсик");
        Actble robot = new Robot("Валли");
        Actble human = new Human("Колян");

        cat.run();
        cat.jump();
        robot.run();
        robot.jump();
        human.run();
        human.jump();
    }
}
