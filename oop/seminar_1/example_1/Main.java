package oop.seminar_1.example_1;

public class Main {
    public static void main(String[] args) {
        // есть двумерная карта с роботами
        // Роботы это объекты, они могут перемещаться по карте
        // Карта имеет границы
        // 2 робота не могут находиться в одной точке вместе

        RobotMap map = new RobotMap(100, 100, 10);
        // try {
        //     map.createRobot(new Point(0, 1));
        // } catch (RobotCreationException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        try {
            RobotMap.Robot robot = map.createRobot(new Point(10, 10));
        } catch (RobotCreationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
