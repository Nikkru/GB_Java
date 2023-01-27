package oop.seminar_3;

import java.util.Iterator;

public class MainRange {
    public static void main(String[] args) {

        for (Object i: Range_.fromT0(1, 100)) {
            System.out.println(i);
        }
    }
    private static class Range_ implements Iterable {

        int start;
        int finish;
        public static Range_ fromT0(int from, int to) {
            return new Range_(from, to);
        }

        private Range_(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        @Override

        public Iterator iterator() {
            return new Iterrator(start);
        }
        class Iterrator implements Iterator<Integer> {

            private int current;

            public Iterrator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= finish;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}
