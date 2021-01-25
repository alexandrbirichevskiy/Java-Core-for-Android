package com.alexbirichevskiy.homework_3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
//      Вызов метода для задания №1
//      task1();
//      Вызов метода для задания №1
        task2();
    }

//  Задание №1
    public static void task1() {
        int n = 3;
        Random rd = new Random();
        int x = rd.nextInt(10);
        Scanner scan = new Scanner(System.in);
        while (n > 0) {
            System.out.print("Введите число от 0 до 9: ");
            int a = scan.nextInt();
            if (a == x){
                System.out.println("Поздравляю! Вы угадали!");
                break;
            }
            else if (a > x){
                System.out.println("Загаданное число меньше введенного!");
            }
            else {
                System.out.println("Загаданное число больше введенного!");
            }
            n--;
            if (n==0){
                System.out.println("Жаль, но вы проиграли :(");
            }
            else {
                System.out.printf("Количество оставшихся попыток: %d", n);
                System.out.println();
            }
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int yn = scan.nextInt();
        if (yn ==1){
            task1();
        }
        else System.exit(0);
    }


//  Задание №2
    public static void task2() {
//      Создаем массив
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

//      Генерируем случайное слово из массива
        Random rd = new Random();
        int indexWord = rd.nextInt(words.length);
        String word = words[indexWord];
        System.out.println(word);

//      Создаем массив с размером 15 и заполняем каждый элемент значением #
        String[] arr = new String[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "#";
        }

//      Создаем бесконечный цикл с точкой выхода при совпадении слов
        while (true) {

//          Вводим слово и считываем его
            System.out.println("Введите загаданное слово: ");
            Scanner scan = new Scanner(System.in);
            String newWord = scan.nextLine();

//          Проверяем на равентво слова. Если да - выход из программы. если нет, переходим к else
            if (newWord.equals(word)) {
                System.out.println("Поздравляю! Вы угадали!");
                System.exit(0);
            } else {

//              Проходимся циклами по словам и все совпадения записываем в ранее созданный массив
                for (int i = 0; i < newWord.length(); i++) {
                    char a = newWord.charAt(i);
                    for (int j = 0; j < word.length(); j++) {
                        char b = word.charAt(j);
                        if ((i == j) && (a == b)) {
                            arr[i] = Character.toString(a);
                        }
                    }
                }
                System.out.println("Вы не угадали! Попробуйте еще раз");
                System.out.println("Подсказка:");

//              Выводим буквы, стоящие на своих местах
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }
}
