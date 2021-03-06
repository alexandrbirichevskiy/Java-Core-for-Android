package com.alexbirichevskiy.homework_13;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MainClass {
    public static final int CARS_COUNT = 5;
    public static CyclicBarrier cb = new CyclicBarrier(CARS_COUNT, new StartRaceMessage());
    public static Semaphore sem = new Semaphore(CARS_COUNT / 2);
    public static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(sem), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, readWriteLock);
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
//        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}
