package com.alexbirichevskiy.homework_11.task_3;

public class Main {
    public static void main(String[] args) {
//      Создаем первую коробку
        Box box1 = new Box();
//      Создаем вторую коробку
        Box box2 = new Box();
//      Создаем третью коробку
        Box box3 = new Box();
//      Создаем 5 яблок
        Apple apple = new Apple(5);
//      Создаем еще 11 яблок
        Apple apple1 = new Apple(11);
//      Создаем 10 апельсинов
        Orange orange = new Orange(10);
//      Кладем 5 яблок в первую коробку
        box1.putInBox(apple);
//      Тут у нас не получается положить апельсины в первую коробку
        box1.putInBox(orange);
//      Кладем еще 11 яблок в первую коробку
        box1.putInBox(apple1);
//      Кладем 10 апельсинов во вторую коробку
        box2.putInBox(orange);
//      Узнаем вес первой коробки
        System.out.println(box1.getWeight());
//      Узнаем вес второй коробки
        System.out.println(box2.getWeight());
//      Сравниваем веса коробок
        System.out.println(box1.compare(box2));
//      Дальше пересыпаем фрукты из коробки 1 в коробку 3
        box1.pourOver(box3);
//        System.out.println(box1.getBox());
//        System.out.println(box3.getBox());
        System.out.println(box3.getWeight());
        box2.pourOver(box3);
        System.out.println(box3.getWeight());
    }
}
