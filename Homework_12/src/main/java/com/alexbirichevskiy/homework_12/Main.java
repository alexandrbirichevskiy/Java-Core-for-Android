package com.alexbirichevskiy.homework_12;

public class Main {
    static final int SIZE = 10_000_000;


    public static void main(String[] args) {
        Main mutex = new Main();
        mutex.firstMethod();
        mutex.secondMethod();
    }

    public void firstMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.print("Первый метод ");
        System.out.println(System.currentTimeMillis() - a);
    }

    public void secondMethod() {
        float[] arr = new float[SIZE];
        int h = SIZE / 2;
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread myThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        myThread1.start();
        myThread2.start();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.currentTimeMillis();
        System.out.print("Второй метод ");
        System.out.println(System.currentTimeMillis() - a);
    }
}