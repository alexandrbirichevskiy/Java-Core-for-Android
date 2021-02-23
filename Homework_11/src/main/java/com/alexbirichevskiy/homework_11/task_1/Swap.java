package com.alexbirichevskiy.homework_11.task_1;

import java.util.Arrays;

public class Swap <T> {
    private T[] arr;

    public Swap(T[] arr) {
        this.arr = arr;
    }

    public void swapElements (int firstIndexElement, int secondIndexElement) {
        try {
            T a = arr[firstIndexElement];
            arr[firstIndexElement] = arr[secondIndexElement];
            arr[secondIndexElement] = a;
            System.out.println(Arrays.deepToString(arr));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Выход за границы массива! Неверный индекс: " + e.getMessage());
        }
    }
}
