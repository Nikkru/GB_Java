package lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lesson_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> lenkedList = new LinkedList<>();

        // getDelay(10, "ArrayList");
        getDelay(10, "LinkedArray");
    }
    public static long feelList(List<Integer> numbers) {
       long start = System.currentTimeMillis();
       for (int i = 0; i < 100000; i++){
        numbers.add(i);
       }
        long finish = System.currentTimeMillis();
        long delay = finish - start;
        return delay; 
    }

    public static void getDelay(Integer count, String name) {
        long sum_ = 0;
         for(int i = 0; i < count; i++){
            // ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> lenkedList = new LinkedList<>();
            sum_ += feelList(lenkedList);
         }
         System.out.println("операция по созданию " + name + " составляет: " + sum_/count);
    }

}
