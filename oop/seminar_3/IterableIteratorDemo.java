package oop.seminar_3;

import java.util.*;

public class IterableIteratorDemo {

    public static void main(String[] args) {
        examples();

        // Comparable<T> (Сравниваемый) =>
        // Comparator<T> (Сравниватель) => (a, b)

        // Iterable<T> (Итерируемый)
        // Iterator<T> (Итератор)

        String string = new String("abcdef");
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
        }

        StringIterator stringIterator = new StringIterator(string);
        for (Character c : stringIterator) {
            System.out.println(c);
        }

        Iterator<Character> iteratorWorker = stringIterator.iterator();
        while (iteratorWorker.hasNext()) {
            Character c = iteratorWorker.next();
            System.out.println(c);
        }

        List<Integer> integers_ = new ArrayList<>();
        for (int i = 10; i < 21; i++) {
            integers_.add(i);
        }
        System.out.println(integers_.toString());

        integers_.removeIf(item -> item == 15);
        System.out.println(integers_.toString());

    }

    private static class StringIterator implements Iterable<Character> {

        private String source;

        public StringIterator(String source) {
            this.source = source;
        }

        @Override
        public Iterator<Character> iterator() {
            return new StringIteratorWorker(source);
        }
    }

    private static class StringIteratorWorker implements Iterator<Character> {

        private char[] chars;
        private int cursor = 0;

        public StringIteratorWorker(String source) {
            this.chars = source.toCharArray();
        }

        @Override
        public boolean hasNext() {
            return cursor <= chars.length - 1;
        }

        @Override
        public Character next() {
            char nextChar = chars[cursor];
            cursor++;
            return nextChar;
        }
    }

    private static void examples() {
        //   1 2 3 4 5
//        List<Integer> integers = List.of(1, 2, 3, 4, 5); // implements Iterable<Integer>
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            integers.add(i);
        }
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = integers.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            sum += integer;
        }
        System.out.println(sum);

//      Set<String> set = Set.of("1", "2", "3", "4", "5");
        String[] array = new String[]{"1", "2", "3", "4", "5"};
        Set<String> set = new HashSet<>();
        Collections.addAll(set, array);
//        set.add("1");
//        set.add("2");
//        set.add("3");
//        set.add("4");
//        set.add("5");
//        String first = set.iterator().next();

        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
    }


}
