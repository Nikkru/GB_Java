package oop.lesson_05.CalcShapes;

public class Circle extends Shape {

    public static Circle create(double radius, String name) {
        var instance = new Circle();
        instance.name = name;
        instance.radius = radius;
        return instance;
    }

    protected double radius;

    private Circle() {
    }


    @Override
    public double getS() {
        double p = 3.14;
//        double s = radius*radius*p;
        double s = Math.pow(this.radius, 2)*Math.PI;
        return s;
    }

    public double getRadius() {

        return this.radius;
    }

    @Override
    public String toString() {
        return String.format("Name: %s , radius: %d mm, area: %d mm", name, radius, getS());
    }
}
