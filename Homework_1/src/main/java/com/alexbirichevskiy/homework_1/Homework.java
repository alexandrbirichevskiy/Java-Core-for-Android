package com.alexbirichevskiy.homework_1;

public class Homework {
    public static void main(String[] args) {
        byte a = 10;
        short b = 30_000;
        int c = 20_000_000;
        long d = 5_000_000_000L;
        float e = 35.45f;
        double f = 3213.545;
        char g = '\u2357';
        boolean h = true;
    }

    public static double task3 (float a, float b, float c, float d){
        double sum = a*(b+(c/d));
    return sum;
    }

    public static boolean task4 (int a, int b) {
        return (a + b >= 10) & (a + b <= 20);
    }

    public static void task5(int a) {
        if (a>=0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task6(int a) {
        return a < 0;
    }

    public static void task7(String s) {
        System.out.println("Привет, " + s + "!");
    }

    public static void task8(int year) {
        if (((year%4 == 0) & (year%100 != 0)) || (year%400 == 0)) {
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }
    }
}
