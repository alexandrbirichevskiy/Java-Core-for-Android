package com.alexbirichevskiy.homework_8;

public class Wall {
    private double lenghWall;

    public Wall(double lenghWall) {
        this.lenghWall = lenghWall;
    }

    public void JumpAlongTheWall(Actble person){
        if (lenghWall <= person.jump()) {
            System.out.println("Препядствие пройдено");
        }
        else {
            System.out.println("Препядствие не пройдено");
        }
    }
}
