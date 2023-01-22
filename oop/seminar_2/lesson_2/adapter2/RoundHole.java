package oop.seminar_2.lesson_2.adapter2;

public class RoundHole implements RoundPeg {

    private final double hole;

    public RoundHole(double hole) { this.hole = hole; }


    @Override
    public double getHole() {
        return hole;
    }
}
