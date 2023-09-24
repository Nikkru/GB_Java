package oop.lesson_05.CalcShapes;

import oop.lesson_05.CalcShapes.Exception.UnacceptableValueException;

public class Circle extends Shape {

    public static Circle create(double radius, String name) throws UnacceptableValueException {
        if (radius < 0)
            throw new UnacceptableValueException("Unacceptable radius value of the new circle" + name + " < 0");
        Circle instance = new Circle();
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
