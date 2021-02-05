package com.alexbirichevkiy.homework_6;

public class Main {
    public static int numberAnimals = 0;
    public static int numberCats = 0;
    public static int numberDogs = 0;

    public static void main(String[] args) {

        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(120);
        catBarsik.swim(10);

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(501);
        dogBobik.swim(9);
 
        System.out.println();
        System.out.println("Количество животных: " + numberAnimals);
        System.out.println("Количество котов: " + numberCats);
        System.out.println("Количество собак: " + numberDogs);
    }
}
