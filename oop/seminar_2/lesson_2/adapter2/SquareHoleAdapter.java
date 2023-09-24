package oop.seminar_2.lesson_2.adapter2;

public class SquareHoleAdapter implements Machine {

    private  final  SquareHole squareHole;

public SquareHoleAdapter(SquareHole squareHole) { this.squareHole = squareHole; }

    @Override
    public RoundHole hole(RoundPeg roundPeg) {
        return null;
    }
}
