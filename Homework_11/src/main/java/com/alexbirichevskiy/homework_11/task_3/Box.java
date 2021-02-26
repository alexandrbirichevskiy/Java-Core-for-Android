package com.alexbirichevskiy.homework_11.task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit>{
    List <T> box = new ArrayList <>();

    public List<T> putInBox(T fruit) {
                if (box.size() != 0 && !box.get(0).getClass().getName().equals(fruit.getClass().getName())){
                    System.out.println("Мы не можем положить это в коробку, там уже лежит " +
                            box.get(0).getClass().getSimpleName());
                }
                else {
                    box.add(fruit);
                }
        return box;
    }

    public float getWeight(){
        int numberFruits = 0;
        float weightFruits = 0.0f;
        if (box.size() == 0) {
            System.out.println("Коробка пустая");
        }
        else {
            weightFruits = box.get(0).getWeightFruit();
            Iterator<T> iter = box.iterator();
            while (iter.hasNext()) {
                numberFruits += iter.next().getNum();
            }
        }
        float weightBox = numberFruits*weightFruits;
        System.out.println("Коробка весит " + weightBox);
        return weightBox;
    }

    public void infoBox() {
        Iterator <T> iter = box.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().getNum());
        }
    }
}
