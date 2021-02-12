package com.alexbirichevskiy.homework_8;

public class Wall implements Obstacle{
    private double lenghWall;

    public Wall(double lenghWall) {
        this.lenghWall = lenghWall;
    }

    public boolean overcomeAnObstacle(Actble person){
        if (lenghWall <= person.jump()) {
            System.out.println("Стена преодолена");
            return true;
        }
        else {
            System.out.println("Стена не преодолена");
            return false;
        }
    }
}
