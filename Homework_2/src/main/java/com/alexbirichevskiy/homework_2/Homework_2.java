package com.alexbirichevskiy.homework_2;
import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {

//        Вызов метода для проверки задания №1
//        task1();
//        Вызов метода для проверки задания №2
//        task2();
//        Вызов метода для проверки задания №3
//        task3();
//        Вызов метода для проверки задания №4
//        task4(7,7);
//        Вызов метода для проверки задания №5
//        task5();
//        Вызов метода для проверки задания №6
//        System.out.println(task6(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
//        Вызов метода для проверки задания №7
//        task7(new int[]{1, 2, 3 , 4, 5}, 3);
    }


    //  Задание №1
    public static void task1(){
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //  Задание №2
    public static void task2(){
        int k = -3;
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++){
            k += 3;
            arr[i] = k;
        }
        System.out.println(Arrays.toString(arr));
    }

    //  Задание №3
    public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //  Задание №4
    public static void task4(int x, int y){
        int[][] arr = new int[x][y];
        int length = arr.length;
        for (int i = 0; i < length; i++){
            System.out.println();
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i+j == length-1)){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    //  Задание №5
    public static void task5(){
        int[] arr = {-1, -15, 3, 2, 11, 4, 5, 2, 4, 0, 9, 1 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение элемента массива: " + max);
        System.out.println("Минимальное значение элемента массива: " + min);
    }

    //  Задание №6
    public static boolean task6(int[] arr){
        double sum = 0;
        int left = 0;
        for (int i = 0; i < arr.length; i ++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i ++) {
            left += arr[i];
            if (left == sum/2) {
                return true;
            }
        }
        return false;
    }

    //  Задание №7
    public static void task7(int[] arr, int n) {
        if (n > 0) {
            for (int m = n; m > 0; m--) {
                for (int i = 0; i < arr.length - 1; i++) {
                    int a = arr[i];
                    arr[i] = arr[(i + 1) % arr.length];
                    arr[(i + 1) % arr.length] = a;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        else if (n<0) {
            for (int m = n; m < 0; m++) {
                for (int i = 0; i < arr.length-1; i++) {
                    int a = arr[arr.length-i-1];
                    arr[arr.length-i-1] = arr[(arr.length-i) % arr.length];
                    arr[(arr.length-i) % arr.length] = a;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        else {
            System.out.println(Arrays.toString(arr));
        }
    }
}

