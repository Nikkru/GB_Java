package oop.lesson_05.CalcShapes;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public static Rectangle create( double a, double b, String name) {
        var instance = new Rectangle();
        instance.name = name;
        instance.a = a;
        instance.b = b;
        return instance;
    }
    private Rectangle() {
    }

    @Override
    public double getS() {
        return this.a * this.b;
    }

    @Override
    public String toString() {
        return String.format("Name: %s , width: %d mm, height: %d mm", name, a, b);
    }
}
