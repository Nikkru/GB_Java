package oop.seminar_2.lesson_2.game;

public class Wall {

    private final int height;

    public Wall(int distance) {
        this.height = distance;
    }

    public boolean overcome(Jumpable jumpable) {
        int jumpLimit = jumpable.getJumpLimit();
        return jumpLimit >= height;
    }

    public int getHeight() {
        return height;
    }
}
