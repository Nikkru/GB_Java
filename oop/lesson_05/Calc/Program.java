package oop.lesson_05.Calc;

public class Program {
    public static void main(String[] args) {

        SumModel m = new SumModel();
        View v = new View();
        Presenter p = new Presenter(m, v);
        p.buttonClick();
    }
}
