package com.alexbirichevskiy.homework_11.task_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList <T> {
    private T[] arr;

    public ArrayToList(T[] arr) {
        this.arr = arr;
    }

    public List<T> arrayToArrayList() {
        List <T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
