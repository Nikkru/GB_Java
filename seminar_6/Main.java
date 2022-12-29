package seminar_6;

import seminar_6.game.Cat;
import seminar_6.game.Plate;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        
        oopDemo();

//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7};
//        Set<Integer> unique = new HashSet();
//        int[] var3 = array;
//        int var4 = array.length;

//        for(int var5 = 0; var5 < var4; ++var5) {
//            int x = var3[var5];
//            System.out.println("Значение [" + x + "] еще не встречалось? " + unique.add(x));
//        }
//
//        System.out.println(unique);
    }

    private static void oopDemo() {
//        new HashSet();
        Plate plate = new Plate(250);
        Cat gav = new Cat("Gav", 200, 0);
        System.out.println("Кот " + gav.name + " сыт? - " + gav.isSatiety());
        gav.eat(100);
        System.out.println("Кот " + gav.name + " сыт? - " + gav.isSatiety());
        Cat murzik = new Cat("Murzik", 70, 5);
        System.out.println("Кот " + murzik.name + " сыт? - " + murzik.isSatiety());
        murzik.eat(100);
        System.out.println("Кот " + murzik.name + " сыт? - " + murzik.isSatiety());
        System.out.println("===============================");
        System.out.println(gav);
        System.out.println(murzik);
        System.out.println(plate);
        System.out.println(gav.equals(murzik));
        System.out.println(gav.equals(plate));
        Cat anotherGav = new Cat("Gav", 20, 10);
        System.out.println(gav.equals(anotherGav));
        System.out.println(gav.hashCode() == anotherGav.hashCode());
        HashSet<Cat> cats = new HashSet();
        cats.add(gav);
        cats.add(anotherGav);
        System.out.println(cats);
    }
}
