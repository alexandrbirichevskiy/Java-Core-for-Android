package com.alexbirichevskiy.homework_8;

public class RunningTrack {
    private double lenghRunningTrack;

    public RunningTrack(double lenghRunningTrack) {
        this.lenghRunningTrack = lenghRunningTrack;
    }

    public void RunAlongTheTrack(Actble person){
        if (lenghRunningTrack <= person.run()) {
            System.out.println("Препядствие пройдено");
        }
        else {
            System.out.println("Препядствие не пройдено");
        }
    }
}
