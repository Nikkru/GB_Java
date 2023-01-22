package oop.seminar_2.lesson_2.game;

public class Road {

    private final int distance;

    public Road(int distance) {
        this.distance = distance;
    }



    public boolean overcome(Runnable runnable) {
        int distanceLimit = runnable.getDistanceLimit();
        return false;
    }


    public int getDistance() {
        return distance;
    }
}
