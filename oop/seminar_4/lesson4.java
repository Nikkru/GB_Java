package oop.seminar_4;

import java.awt.*;
import java.util.*;
import java.util.List;

public class lesson4 {
    public static void main(String[] args) {
        String[] array = new String[] {"second", "first", "third", "forth"};
        List<String> first = new ArrayList<>();
        Collections.addAll(first, array);
//        List<String> first = new ArrayList<>(List.of("first", "second", "forth"));
        Collections.sort(first);
        System.out.println(first);
//        getIntegers();
//        getNumbersStorage();
    }

    private static void getNumbersStorage() {
        NumbersStorage<Long> numbersStorage = new NumbersStorage();
        numbersStorage.add(2L);
        numbersStorage.add(5L);
        numbersStorage.add(5L);

        System.out.println(numbersStorage.get(2));
        Long longValue = numbersStorage.get(0);
        System.out.println(longValue);
    }

    private static void getIntegers() {
        ArrayList<Integer> intergers = new ArrayList();
        intergers.add(1);
        intergers.add(2);
        intergers.add(3);
        intergers.add(4);
        intergers.add(5);
//        intergers.add("");

        System.out.println(intergers);

        for (int i = 0; i < intergers.size(); i++) {
            Object obj = intergers.get(i);
        }
    }

    public static class NumbersStorage<E extends Number> {
        private List<E> numbers = new ArrayList<E>();
        public void add(E number) {
            numbers.add(number);
        }
        public E get(int i) {
            return numbers.get(i);
        }
    }
}
