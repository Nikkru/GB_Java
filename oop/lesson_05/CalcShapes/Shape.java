package oop.lesson_05.CalcShapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected double area;
    protected String name;

    public Shape(double area, String name) {
        this.area = area;
        this.name = name;
    }

    protected Shape() {
    }

    public double getS() {
        return area;
    }
    public void setNane(String value) {
        name = value;
    }
    public List<Shape> shapes = new ArrayList<Shape>();
}
