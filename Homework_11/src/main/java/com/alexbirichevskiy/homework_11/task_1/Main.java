package com.alexbirichevskiy.homework_11.task_1;

public class Main {
    public static void main(String[] args) {
        String[] arrStr = new String[] {"ноль", "один", "два", "три", "четыре"};
        Integer[] arrInt = new Integer[] {0, 1, 2, 3, 4};
        Swap a = new Swap (arrStr);
        a.swapElements(0, 3);
    }
}
