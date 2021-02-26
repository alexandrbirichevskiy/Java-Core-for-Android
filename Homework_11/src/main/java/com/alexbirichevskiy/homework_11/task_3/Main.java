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
//      Смотрим, удалось ли пересыпать
        System.out.println(box3.getWeight());
//      Видим, что коробка 1 стала пустой
        System.out.println(box1.getWeight());
//      Тут у нас не получается пересыпать апельсины к яблокам
        box2.pourOver(box3);
//      Создаем 4 апельсина
        Orange orange1 = new Orange(1);
//      Кладем 4 апельсина в первую коробку, ведь уже пустая
        box1.putInBox(orange1);
//      Перекладываем из второй коробки в первую
        box2.pourOver(box1);
//      Все успешно пересыпалось. Ведь и там и там жили апельсины
        System.out.println(box1.getWeight());
    }
}
