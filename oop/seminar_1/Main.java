package oop.seminar_1;

public class Main {
    public static void main(String[] args) {
        Robot1 robot = new Robot1();
        System.out.println(robot);
        robot.move(new Point(3, -5));
        System.out.println(robot);
    }
}
