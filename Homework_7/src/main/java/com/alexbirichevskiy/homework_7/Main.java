package com.alexbirichevskiy.homework_7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(10);


        Cat cats[] = new Cat[5];
        cats[0] = new Cat("Ракета", 3);
        cats[1] = new Cat("Барсик", 1);
        cats[2] = new Cat("Мурзик", 4);
        cats[3] = new Cat("Круассан", 5);
        cats[4] = new Cat("Бегемот", 2);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].satietyCat();
        }
    }
}
