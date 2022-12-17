package seminar_3.homework_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class homework_3 {
    public static void main(String[] args) {
        /*
         * 1. Пусть дан произвольный список целых чисел, 
         * удалить из него четные числа 
         * (в языке уже есть что-то готовое для этого)
         */
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 4, 3, 56, 76, 89, 60, 54, 65, 77, 33, 45, 65, 89, 897));
        ListIterator<Integer> iteratorList = intList.listIterator();       
        System.out.println(intList.toString());

        while (iteratorList.hasNext()) {
            Integer i = iteratorList.next();
            if(i%2==0) {
                iteratorList.remove();
            }
        }
        System.out.println(intList.toString());

        /*
         *  2. Задан целочисленный список ArrayList. 
         * Найти минимальное, максимальное и среднее арифметическое из этого списка.
        */
        Collections.sort(intList);
        Integer size = intList.size();

    System.out.println("минимальное: " + intList.get(0));
    System.out.println("максимальное: " + intList.get(size-1));

    Integer sum_ = 0;
    for (Integer i: intList){
        sum_ += i;
    }
    System.out.println("среднее арифметическое: " + sum_/size);
    }
}
