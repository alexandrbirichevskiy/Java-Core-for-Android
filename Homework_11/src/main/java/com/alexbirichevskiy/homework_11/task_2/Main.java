package com.alexbirichevskiy.homework_11.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrStr = new String[] {"ноль", "один", "два", "три", "четыре"};
        ArrayToList arr = new ArrayToList(arrStr);
        System.out.println(arr.arrayToArrayList());
        System.out.println(arr.arrayToArrayList().getClass());
    }
}
