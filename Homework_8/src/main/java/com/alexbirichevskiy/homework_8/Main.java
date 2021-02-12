package com.alexbirichevskiy.homework_8;

public class Main {
    public static void main(String[] args) {
        Actble[] persons = new Actble[3];
        persons[0] = new Robot("Валли", 150, 200);
        persons[1] = new Cat("Барсик", 100, 150);
        persons[2] = new Human("Колян", 50, 100);

        Obstacle[] obstacles = new Obstacle[4];
        obstacles[0] = new RunningTrack(80);
        obstacles[1] = new Wall(120);
        obstacles[2] = new RunningTrack(120);
        obstacles[3] = new Wall(170);

        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j].overcomeAnObstacle(persons[i]) == false){
                    break;
                }
            }
        }
    }
}
