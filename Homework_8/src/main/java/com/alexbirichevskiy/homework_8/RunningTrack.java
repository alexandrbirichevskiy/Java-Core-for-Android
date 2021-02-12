package com.alexbirichevskiy.homework_8;

public class RunningTrack implements Obstacle{
    private double lenghRunningTrack;

    public RunningTrack(double lenghRunningTrack) {
        this.lenghRunningTrack = lenghRunningTrack;
    }

    public boolean overcomeAnObstacle(Actble person){
        if (lenghRunningTrack <= person.run()) {
            System.out.println("Беговая дорожка преодолена");
            return true;
        }
        else {
            System.out.println("Беговая дорожка не преодолена");
            return false;
        }
    }
}
