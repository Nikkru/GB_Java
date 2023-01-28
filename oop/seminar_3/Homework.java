package oop.seminar_3;

import java.util.*;

public class Homework {

    public static void main(String[] args) {
        // 1. Создать список объектов типа Notebook
        // Отсортировать его тремя способами:
        // 1.1 по ОЗУ (ram)
        // 1.2 по цене (price)
        // 1.3 сначала по ram, потом по price (если ram не равны, сортируем по ним; если равны, то по цене)

        // 2. Реализовать итератор для массива
        int[] source = {1, 2, 3, 4, 5, 6, 7};
        Iterator<Integer> intArrayIterator = new IntArrayIterator(source);
        while (intArrayIterator.hasNext()) {
            System.out.println(intArrayIterator.next());
        }
        List<Notebook> notebooks = new ArrayList<Notebook>();

        Notebook note1 = new Notebook(8,8000);
        Notebook note2 = new Notebook(16,16000);
        Notebook note3 = new Notebook(8,8500);
        Notebook note4 = new Notebook(16,18000);
        Notebook note5 = new Notebook(8,10000);

        notebooks.add(note1);
        notebooks.add(new Notebook(16,17000));
        notebooks.add(note2);
        notebooks.add(note4);
        notebooks.add(note3);
        notebooks.add(note5);

        System.out.println("without sort / " + notebooks.toString());

        Comparator<Notebook> comporatorByRam = Comparator.comparing(Notebook::getRam);
        Comparator<Notebook> comporatorByPrice = Comparator.comparing(Notebook::getPrice);

        Collections.sort(notebooks, comporatorByRam);
        System.out.println("sort by RAM / " + notebooks.toString());

        Collections.sort(notebooks, comporatorByPrice);
        System.out.println("sort by PRICE / " + notebooks.toString());

        Collections.sort(notebooks);
        System.out.println("sort by ram and price / " + notebooks.toString());
    }

    private static class Notebook implements Comparable<Notebook> {

        private final int ram;
        private final double price;

        public Notebook(int ram, double price) {
            this.ram = ram;
            this.price = price;
        }

        public int getRam() {
            return ram;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "ram/price " + getRam() + "/" + getPrice();
        }

        @Override
        public int compareTo(Notebook o) {
            double result = this.ram;
            if (result==0) {
                result =  this.price;
            }
            return (int) result;
        }
    }

    private static class IntArrayIterator implements Iterator<Integer> {

        private final int[] source;
        private static int now = 0;

        public IntArrayIterator(int[] source) {
            this.source = source;
        }

        @Override
        public boolean hasNext() {
            return now < source.length;
        }

        @Override
        public Integer next() {
            return now++;
        }
    }

}
