package seminar_6.game;

import java.util.Objects;

public class Cat {
    private String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (this.satiety) {
            System.out.println("Кот сытый");
        } else {
            this.satiety = plate.decreaseFood(this.appetite);
            if (this.satiety) {
                System.out.println("Кот наелся");
            } else {
                System.out.println("Кот не поел");
            }

        }
    }

    public boolean isSatiety() {
        return this.satiety;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Cat cat = (Cat)o;
            return this.appetite == cat.appetite && this.name.equals(cat.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.appetite});
    }

    public String toString() {
        return "Cat[" + this.name + "]";
    }
}
