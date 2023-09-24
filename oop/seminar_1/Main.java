package oop.seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Robot1 robot = new Robot1();
        System.out.println(robot);
        robot.move(new Point(3, 5));
        System.out.println(robot);

        // robotExample();
        polymorhpismExample();
    }
    private static void robotExample() {
        Robot1 robot1 = new Robot1();
        System.out.println(robot1);
        robot1.move(new Point(3, 10));
        System.out.println(robot1);
    }
    private static void polymorhpismExample() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("cat"));
        animals.add(new Dog("dog"));
        animals.add(new Cat("mouse"));

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.voice();
        }
    }
}
