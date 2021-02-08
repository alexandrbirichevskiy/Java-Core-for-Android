package com.alexbirichevskiy.homework_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        this.satiety = plate.decreaseFood(appetite);
    }

    public void satietyCat() {
        if (this.satiety) {
            System.out.println("Кот по имени " + name + " сыт");
        } else {
            System.out.println("Кот по имени " + name + " голоден");
        }
    }


    public int getAppetite() {
        return appetite;
    }
}
