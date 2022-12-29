package seminar_6.game;

import java.util.Objects;

public class Cat {
    public String name;
    private final int appetite;
    private int countEnergy;
    private boolean satiety = makeSatiety();

    public Cat(String name, int appetite, int countEnergy) {
        this.name = name;
        this.appetite = appetite;
        this.countEnergy = countEnergy;
    }

    boolean makeSatiety() {
        if (countEnergy > 9) {
            return true;
        } else {
            return false;
        }
    }
    public void eat(int eatCount) {
        System.out.println("В миске есть " + eatCount + " корма. У миски кот " + name);
        int needForFull = 0;
        int nowApetit = appetite - appetite/10*countEnergy;
        if (this.satiety) {
            System.out.println(name + " сытый.");
        } else {
//            this.satiety = plate.decreaseFood(this.appetite);
            if (nowApetit < eatCount) {
                eatCount -= nowApetit;
                countEnergy = 10;
                satiety = makeSatiety();
                System.out.println(name + " наелся.");
                System.out.println("В миске осталось " + eatCount + " корма.");
            } else {
                System.out.println(name + " не наелся.");
                needForFull = nowApetit - appetite/10*countEnergy;
                countEnergy += eatCount/(appetite/10);
                System.out.println("Энергия кота теперь: " + countEnergy);
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
