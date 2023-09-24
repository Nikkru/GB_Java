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
    private List<T> listFruit;

    // Должен быть конструктор
    public Box(List<T> listFruit) {
        this.listFruit = listFruit;
    }

    // Добавление фрукта
    public void add(T fruit) {
        listFruit.add(fruit);
    }
    
    public double getWeight() {
        double sum = 0.0;
        for (Fruit i: listFruit) {
            sum += i.getWeight();
//            sum += listFruit.get(i).getWeight();
        }
//        Fruit fruit = listFruit.get(0);
//        listFruit.add(new Fruit(1.0));
        return sum;
    }

    // Метод, который пересыпает фрукты из текущей коробки в другую коробку
    public void moveTo(Box <? super T> anotherbox) {
        // Пересыпать фрукты из текущей коробки в anotherBox
        for (T fruit: listFruit) {
            anotherbox.add(fruit);
        }
        listFruit.clear();
    }

}
