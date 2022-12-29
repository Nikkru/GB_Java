# домашняя работа к семинару №6
_Доделать задачу про кота.
Переделать флажок true\false сытность на хранение количества текущей энергии в диапазоне от 1 до 10._
#### флажок сытность реализован как вычисляемое поле 
```
    private boolean satiety = makeSatiety();
    
    boolean makeSatiety() {
        if (countEnergy > 9) {
            return true;
        } else {
            return false;
        }
    }
```
#### поле класса `countEnergy` несет в себе количество текущей энергии экземпляра класса в диапозоне 0 - 10.
#### в методе класса `eat` данное поле изменяется для экземпляра класса по результату кормления
```
   public void eat(int eatCount) {
        System.out.println("В миске есть " + eatCount + " корма. У миски кот " + name);
        int needForFull = 0;
        int nowApetit = appetite - appetite/10*countEnergy;
        if (this.satiety) {
            System.out.println(name + " сытый.");
        } else {
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
```