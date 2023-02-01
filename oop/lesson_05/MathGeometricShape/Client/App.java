package oop.lesson_05.MathGeometricShape.Client;

import oop.lesson_05.MathGeometricShape.Core.Models.Model;
import oop.lesson_05.MathGeometricShape.Core.Presenters.Presenter;
import oop.lesson_05.MathGeometricShape.Core.Views.View;
import oop.lesson_05.MathGeometricShape.Mathematics.CalculateArea.CalculateArea;
import oop.lesson_05.MathGeometricShape.Mathematics.Exceptions.UnacceptableValueException;

public class App {
    Presenter p;
    View ui;
    Model model;

    public App() {
        ui = new ConsoleView();
        model = new Model(CalculateArea.getInstance(), "Без имени.jpg");
        p = new Presenter(ui, model);
    }

    public void start() throws UnacceptableValueException {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - append shape\n")
                .append("2 - show shape\n")
                .append("3 - show all area\n")
                .append("0 - exit\n");


        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    p.append();
                    break;
                case "2":
                    p.show();
                    break;
                case "3":
                    p.showArea();
                    break;
                case "0":
                    return;
            }
        }
    }
}
