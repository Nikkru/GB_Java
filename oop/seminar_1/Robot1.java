package oop.seminar_1;

public class Robot1 {
    
    // У каждого робота есть его позиция на двумерном поле (целочисленные координаты х и у)
    // По умолчанию робот находится в какой-то определенной позиции (0, 0)
    // Мы должны уметь перемещать робота на другую позицию с другими координатами
    // Робот должен уметь отдавать свое текущее положение

    public static final int DEFAULT_X_POSITION = 0;
    public static final int DEFAULT_Y_POSITION = 0;

    public static final Point DEFAULT_POSITION = new Point(DEFAULT_X_POSITION, DEFAULT_Y_POSITION);

        private Point point;

        public Robot1()
        {
            this.point = DEFAULT_POSITION;
        }

        public void move(Point point) {
            validatePoint(point);
            this.point = point;
        }

        private void validatePoint(Point point) {
            if (point.getX() < 0 || point.getY() < 0) {
                throw new IllegalArgumentException();
            }
        }

        public Point getPoint() {
          return point;
        }

        @Override
        public String toString() {
        return "Robot - " + point;
        }
    }
