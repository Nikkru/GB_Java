package oop.seminar_1.example_1;

import java.util.*;

public class RobotMap {

    private final int n;
    private final int m;
    private final int maxSize;
    private final List<Robot> robots; // пустой список по умолчанию в экземпляре класса

    public RobotMap(int n, int m, int maxRobotCount) throws MapCreationException {
        // TODO: 13.01.2023 Реализовать проверку входных параметров.
        try {
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
        this.maxSize = maxRobotCount;
        validateMapValue(n, m, maxRobotCount);
        } catch (MapCreationException e) {
            throw new MapCreationException(e.getMessage());
        }
    }

    public Robot createRobot(Point point) throws RobotCreationException {
        final MapPoint robotPosition;
        try {
            validatePoint(point);
            validateCountRobotsIsntMore(robots.size());
            robotPosition = new MapPoint(point.getX(), point.getY());
        } catch (PointValidationException e) {
            throw new RobotCreationException(e.getMessage());
        }

        Robot robot = new Robot(robotPosition);
        robots.add(robot);
        return robot;
    }

    private void validatePoint(Point point) throws PointValidationException {
        validatePointIsFree(point);
    }

    private void validatePointIsFree(Point point) throws PointValidationException {
        for (Robot robot : robots) {
            if (point.equals(robot.getPoint())) {
                throw new PointValidationException("Позиция " + point + " занята другим роботом: " + robot + " ");
            }
        }
    }

    /*
    проверка не переполнение массива robots
     */
    private void validateCountRobotsIsntMore(int count_) throws RobotCreationException {
        if (count_ == maxSize) {
            throw new RobotCreationException("Новый робот переполняет допустимый размер массива рботов - "
                    + robots.size() + " ");
        }
    }

    private void validateMapValue(int n, int m, int maxCount) throws MapCreationException {
        if (n <=0 || m <=0) {
            throw new MapCreationException("Площадь карты должна быть больше ноля ");
        }
        else if (maxCount <= 0 || maxCount > n*m) {
            throw new MapCreationException("Карта должна принять хотя бы одного, " +
                    "и не более ее площади - " + maxCount + " ");
        }
    }
//    private void validateMaxCountRobotsValue(int n, int m, int maxCount) throws MapCreationException {
//        if (maxCount <= 0 || maxCount > n*m) {
//            throw new MapCreationException("Возможное количество роботов должно быть больше 0 " +
//                    "и меньше площади карты - " + maxCount + " ");
//        }
//    }

    public class Robot {

        public final Direction DEFAULT_DIRECTION = Direction.TOP;

        private final UUID id;
        private MapPoint point;
        private Direction direction;

        public Robot(MapPoint point) {
            this.id = UUID.randomUUID();
            this.point = point;
            this.direction = DEFAULT_DIRECTION;
        }

        public void move(int stepCount) throws RobotMoveException {
            final MapPoint newPoint;
            try {
                if (direction == Direction.TOP) {
                    newPoint = new MapPoint(point.getX(), point.getY() - stepCount);
                } else if (direction == Direction.RIGHT) {
                    newPoint = new MapPoint(point.getX() + stepCount, point.getY());
                } else if (direction == Direction.LEFT) {
                    newPoint = new MapPoint(point.getX() - stepCount, point.getY());
                } else {
                    newPoint = new MapPoint(point.getX(), point.getY() + stepCount);
                }
                validatePoint(newPoint);
            } catch (PointValidationException e) {
                throw new RobotMoveException(e.getMessage(), this);
            }

            this.point = newPoint;
        }

        public void changeDirection(Direction direction) {
            this.direction = direction;
        }

        public MapPoint getPoint() {
            return point;
        }


        @Override
        public String toString() {
            return "(Robot: ID: " + id + " , координаты: " + point + ")";
        }
    }

    public class MapPoint extends Point {

        public MapPoint(int x, int y) throws PointValidationException {
            super(x, y);

            if (x < 0 || x > n || y < 0 || y > m) {
                throw new PointValidationException("Недопустимое значение Point: " + this);
            }
        }
    }
    public  String toStringRobotsSize() { return "Сейчас на карте есть " + robots.size() + " робот из " +
            maxSize + " возможных";}
    @Override
    public String toString() {
        return "Ширина карты - " + m + ", долгота - " + n + " , число роботов на карте не больше - " + maxSize;
    }
}
