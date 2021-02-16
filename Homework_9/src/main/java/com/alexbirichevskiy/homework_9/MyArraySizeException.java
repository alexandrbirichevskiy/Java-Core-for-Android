package com.alexbirichevskiy.homework_9;

public class MyArraySizeException extends Exception {
    private int line;
    private int col;
    private int arrLen;

    MyArraySizeException(int line) {
        this.line = line;
    }

    MyArraySizeException(int arrLen, int line, int col) {
        this.arrLen = arrLen;
        this.line = line;
        this.col = col;
    }

    public String toString() {
        if (arrLen == 4) {
            return "MyArraySizeException [Некорректно введен размер массива] " +
                    "Строка: " + line +
                    " Количество элементов в строке: " + col;
        } else {
            return "MyArraySizeException [Некорректно введен размер массива] " +
                    "Количество строк: " + line;
        }
    }
}
