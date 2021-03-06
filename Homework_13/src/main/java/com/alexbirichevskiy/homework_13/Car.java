package com.alexbirichevskiy.homework_13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReadWriteLock;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private CyclicBarrier cb;
    private CyclicBarrier cbr;
    private ReadWriteLock readWriteLock;
    private Race race;
    private int speed;
    private String name;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cb, ReadWriteLock readWriteLock, CyclicBarrier cbr) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
        this.cbr = cbr;
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        if (readWriteLock.writeLock().tryLock()){
            readWriteLock.writeLock().lock();
            System.out.println(this.name + " - WIN");
            Thread.interrupted();

        }
        else {
            try {
                cbr.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
