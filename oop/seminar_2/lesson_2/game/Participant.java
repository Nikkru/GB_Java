package oop.seminar_2.lesson_2.game;

public abstract class Participant implements Runnable, Jumpable, Swimmable, Weightable {

    private final String name;
    private final int distanceLimit;
    private final int swimLimit;
    private final int jumpLimit;
    private final int weightLimit;

    public Participant(String name, int distanceLimit, int swimLimit, int jumpLimit, int weightLimit) {
        this.name = name;
        this.distanceLimit = distanceLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.weightLimit = weightLimit;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getDistanceLimit() {
        return distanceLimit;
    }

    @Override
    public int getSwimLimit() {
        return swimLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int getWeightLimit() {
        return weightLimit;
    }
}
