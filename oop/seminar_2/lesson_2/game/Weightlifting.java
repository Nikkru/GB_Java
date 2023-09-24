package oop.seminar_2.lesson_2.game;

public class Weightlifting {

    private final int weight;

    public Weightlifting(int weight) {
        this.weight = weight;
    }



    public boolean overcome(Weightable weightable) {
        int weightLimit = weightable.getWeightLimit();
        return weightLimit >= weight;
    }


    public int getWeight() {
        return weight;
    }
}
