package seminar_3.homework_3;

import java.util.ArrayList;
import java.util.Arrays;
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
    }
}
