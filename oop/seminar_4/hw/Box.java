package oop.seminar_4.hw;

import java.util.ArrayList;
import java.util.List;
import oop.seminar_4.hw.Fruit;

public class Box <T extends Fruit>/* <FIXME: Указать дженерик> */{

    // Реализовать хранение фруктов в коробке.
    // Должны быть доступны следующие возможности
    // Добавление фрукта
    // Должен быть конструктор
    // Метод, который пересыпает фрукты из текущей коробки в другую коробку
    // Для внутреннего хранения можно использовать например List

//    private List;
    private List<Fruit> listFruit = new ArrayList<Fruit>();

    public void add(Fruit fruit) {
        // TODO: 24.01.2023
        listFruit.add(fruit);
    }
    
    public double getWeight() {
        // TODO: 24.01.2023 Просуммировать веса всех фруктов в коробке
        double sum = 0.0;
        for (Fruit i: listFruit) {
            sum += i.getWeight();
        }
        return sum;
    }

    public void moveTo(Box /* <FIXME: Указать дженерик> */ anotherBox) {
        // TODO: 24.01.2023
        // Пересыпать фрукты из текущей коробки в anotherBox
    }

}
