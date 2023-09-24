package oop.lesson_05.MathGeometricShape.Core.Models;

import oop.lesson_05.MathGeometricShape.Mathematics.CalculateArea.Calculate;
import oop.lesson_05.MathGeometricShape.Mathematics.Shapes.Canvas;
import oop.lesson_05.MathGeometricShape.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
