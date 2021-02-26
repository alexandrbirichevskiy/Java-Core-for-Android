package com.alexbirichevskiy.homework_11.task_3;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    List<T> box = new ArrayList<>();
    private int numberFruits;
    private float weightFruits;

    public List<T> putInBox(T fruit) {
        if (box.size() != 0 && !box.get(0).getClass().getName().equals(fruit.getClass().getName())) {
            System.out.println("Мы не можем положить это в коробку, там уже лежит " +
                    box.get(0).getClass().getSimpleName());
        } else {
            box.add(fruit);
            numberFruits += fruit.getNum();
            weightFruits = fruit.getWeightFruit();
        }
        return box;
    }

    public float getWeight() {
        return numberFruits * weightFruits;
    }

    public boolean compare(Box nBox) {
        return numberFruits * weightFruits == nBox.getWeight();
    }

    public void clearBox() {
        box = new ArrayList<>();
        numberFruits = 0;
        weightFruits = 0;
    }

    public void setBox(List<T> box) {
        this.box = box;
    }

    public List<T> getBox() {
        return box;
    }

    public int getNumberFruits() {
        return numberFruits;
    }

    public float getWeightFruits() {
        return weightFruits;
    }

    public void setNumberFruits(int numberFruits) {
        this.numberFruits = numberFruits;
    }

    public void setWeightFruits(float weightFruits) {
        this.weightFruits = weightFruits;
    }

    public void pourOver(Box inBox) {
        if (numberFruits * weightFruits == 0.0) {
            System.out.println("Коробка пустая, пересывать нечего");
            return;
        }
        if (inBox.getBox().size() == 0) {
            inBox.setNumberFruits(inBox.getNumberFruits()+ numberFruits);
            inBox.setWeightFruits(weightFruits);
            inBox.setBox(box);
            clearBox();
            return;
        }
        if (inBox.getBox().size() != 0 && box.get(0).getClass().getName().equals(inBox.getBox().get(0).getClass().getName())){
            inBox.setNumberFruits(inBox.getNumberFruits()+ numberFruits);
            inBox.setWeightFruits(weightFruits);
            inBox.getBox().addAll(box);
        }
        else {
            System.out.println("Мы не можем пересыпать");
        }
    }
}
