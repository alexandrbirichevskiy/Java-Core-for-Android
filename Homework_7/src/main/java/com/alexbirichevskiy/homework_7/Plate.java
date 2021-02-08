package com.alexbirichevskiy.homework_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("plate: "+ food);
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            return false;
        }
        else {
            food = food - n;
            return true;
        }
    }

    public void addFood (int additionalFood) {
        food+=additionalFood;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
}
