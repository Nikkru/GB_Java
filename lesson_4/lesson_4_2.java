package lesson_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class lesson_4_2 {
    public static void main(String[] args) {
        String str = "";
        Deque <String> deque = new LinkedList<>();
        do{
            Scanner sc = new Scanner(System.in);
            str = sc.next();
            if (!str.equals("print") && !str.equals("revert")) {
                deque.addFirst(str);
            } else if (str.equals("print")) {
                System.out.println(deque);
            } else if (str.equals("revert")) {
                deque.pollFirst();
                System.out.println(deque);
            }
            
        }
        while (!str.equals("quit"));
    }
}
