package com.alexbirichevskiy.homework_9;


public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            twoDimensionalArray(arr);
        } catch (MyArraySizeException e) {
            System.out.println("Исключение: " + e);
        }
    }

    public static void twoDimensionalArray (String[][] arr) throws MyArraySizeException {
        int numLine = 0;
        int numCol;
        if (arr.length != 4) {
            throw new MyArraySizeException(arr.length);
        }
        else {
            for (String[] line : arr) {
                numLine ++;
                numCol = 0;
                for (int i = 0; i < line.length; i++) {
                    numCol ++;
                }
                if (numCol != 4) {
                    throw new MyArraySizeException(arr.length, numLine, numCol);
                }
            }
        }
    }
}
