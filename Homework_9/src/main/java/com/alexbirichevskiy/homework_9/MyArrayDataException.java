package com.alexbirichevskiy.homework_9;

public class MyArrayDataException extends Exception {
    private int x;
    private int y;

    MyArrayDataException (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyArrayDataException [Невозможно преобразовать String к int] Элемент[" + x + "]" + "[" + y + "]";
    }
}
