package com.alexbirichevskiy.homework_9;


public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "2"},
                {"1", "2", "3", "4"},
        };

        try {
            System.out.println(twoDimensionalArray(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Исключение: " + e);
        } catch (MyArrayDataException e) {
            System.out.println("Исключениe: " +e);
        }
    }

    public static int twoDimensionalArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int numLine = 0;
        int numCol;
        int xCoord = 0;
        int yCoord = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException(arr.length);
        } else {
            for (String[] line : arr) {
                numLine++;
                numCol = 0;
                for (int i = 0; i < line.length; i++) {
                    numCol++;
                }
                if (numCol != 4) {
                    throw new MyArraySizeException(arr.length, numLine-1, numCol);
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        xCoord = i;
                        yCoord = j;
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(xCoord, yCoord);
                    }
                }
        }
        return sum;
    }
}