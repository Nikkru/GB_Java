package oop.seminar_2.lesson_2.game;

public class SwimmingPool implements Obstacle {

    private final int distance;

    public SwimmingPool(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant swimmable) {
        int swimLimit = swimmable.getSwimLimit();
        return swimLimit >= distance;
    }
    @Override
    public String type() {
        return "Бассейн";
    }

    public int getDistance() {
        return distance;
    }
}
