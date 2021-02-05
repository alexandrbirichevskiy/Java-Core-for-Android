package com.alexbirichevkiy.homework_6;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(120);
        catBarsik.swim(0);

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(501);
        dogBobik.swim(9);
        dogBobik.run(100);
    }
}
