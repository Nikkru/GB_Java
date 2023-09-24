package oop.seminar_2.lesson_2.game;

public class WeightliftingObstacleAdapter implements Obstacle {

    private final Weightlifting weightlifting;

    public WeightliftingObstacleAdapter(Weightlifting weightlifting) {
        this.weightlifting = weightlifting;
    }

    @Override
    public boolean overcome(Participant participant) {
        return weightlifting.overcome(participant);
    }

    @Override
    public String type() {
        return "Вес";
    }
}
