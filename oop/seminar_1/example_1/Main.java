package oop.seminar_1.example_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MapCreationException {
        // есть двумерная карта с роботами
        // Роботы это объекты, они могут перемещаться по карте
        // Карта имеет границы
        // 2 робота не могут находиться в одной точке вместе

        Scanner userInput = new Scanner(System.in);
        System.out.println("Игра приветсвует Вас!");
        System.out.println(".....................");
        RobotMap map = null;
        while (true) {
            System.out.println("Введите размер поля (два числа через пробел) и максимальное количество возможных " +
                    "роботов (третье число через пробел): ");
            try {
                int n = userInput.nextInt();
                int m = userInput.nextInt();
                int maxCount = userInput.nextInt();
                map = new RobotMap(n, m, maxCount);
                break;
            } catch (MapCreationException e) {
                System.err.printf("Создать карту не удалось! " + e.getMessage());
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        RobotMap map1 = null;
//        System.out.println("Введите размер поля (два числа через пробел) и максимальное количество возможных " +
//                "роботов (третье число через пробел): ");
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int maxCount = scanner.nextInt();
//        map1 = new RobotMap(n, m, maxCount);
//        System.out.println(map1.toString());

//        RobotMap map = new RobotMap(100, 100, 10);

        try {
            RobotMap.Robot robot = map.createRobot(new Point(100, 10));
            System.out.println(robot);
            System.out.println(map.toStringRobotsSize());
            robot.changeDirection(Direction.LEFT);
            robot.move(2);
        } catch (RobotCreationException e) {
            System.err.printf("Создать робота не удалось! " + e.getMessage());
        } catch (RobotMoveException e) {
            System.err.printf("Движение робота " + e.getRobot() + " не удалось!");
        }
        try {
            RobotMap.Robot robot1 = map.createRobot(new Point(0, 0));
            robot1.changeDirection(Direction.BOTTOM);
            robot1.move(3);
        } catch (RobotCreationException e) {
//            e.printStackTrace();
            System.err.printf("Создать робота не удалось! " + e.getMessage());
        } catch (RobotMoveException e) {
            System.err.printf("Движение робота " + e.getRobot() + " не удалось!");
        }
    }
}
