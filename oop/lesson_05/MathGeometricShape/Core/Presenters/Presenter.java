package oop.lesson_05.MathGeometricShape.Core.Presenters;

 
import oop.lesson_05.MathGeometricShape.Core.Infrastructure.Generator;
import oop.lesson_05.MathGeometricShape.Core.Models.Model;
import oop.lesson_05.MathGeometricShape.Core.Views.View;
import oop.lesson_05.MathGeometricShape.Mathematics.Exceptions.UnacceptableValueException;
import oop.lesson_05.MathGeometricShape.Mathematics.Shapes.Circle;
import oop.lesson_05.MathGeometricShape.Mathematics.Shapes.Rectangle;
import oop.lesson_05.MathGeometricShape.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}
