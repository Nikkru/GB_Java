package oop.seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparableDemo {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        String[] array1 = new String[]{"ajsfhakfd", "fa", "bhhf", "add", "ppoqfhdkfajdsfi;ahdff"};
//        List<String> words = new ArrayList<>(List.of(
//                "ajsfhakfd", "fa", "bhhf", "add", "ppoqfhdkfajdsfi;ahdff"
//        ));
//        words.add("ajsfhakfd");
//        words.add("fa");
//        words.add("bhhf");
//        words.add("add");
//        words.add("ppoqfhdkfajdsfi;ahdff");
        Collections.addAll(words, array1);

        // если s1 длиннее s2, то это означает, что s1 меньше, чем о2, то возвращаем любое отрицательное число
//        Comparator<String> stringLengthComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());
//        с лябда-выражением
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() > s2.length()) {
//                    return 1;
//                } else if (s1.length() < s2.length()) {
//                    return -1;
//                }
//                return 0;
//            }
        };
//        Comparator<String> stringLengthComparator = Comparator.comparing(String::length).reversed();

        int compare = stringLengthComparator.compare("abc", "def");
        int compareTo = "abc".compareTo("def");

        Collections.sort(words, stringLengthComparator);
        System.out.println(words);
    }
}
