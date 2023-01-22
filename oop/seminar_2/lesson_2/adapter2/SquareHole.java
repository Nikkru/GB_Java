package oop.seminar_2.lesson_2.adapter2;

public class SquareHole implements SquarePeg{

    private final double a;
    private final double b;


    public SquareHole(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Square getSide() {
        return new Square(a, b);
    }
}
