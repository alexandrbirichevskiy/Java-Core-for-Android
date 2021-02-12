package com.alexbirichevskiy.homework_8;

public class Main {
    public static void main(String[] args) {
        Actble robot = new Robot("Валли", 150, 200);

        RunningTrack track1 = new RunningTrack(100);
        Wall wall1 = new Wall(10);

        track1.RunAlongTheTrack(robot);
        wall1.JumpAlongTheWall(robot);
    }
}
