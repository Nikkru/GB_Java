package lesson_4.homework_4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class homework_4 {
    public static void main(String[] args) {
        /*
         * 1. Поиграться с разными коллекциями (все которые знаете): создавать,
         * добавлять элементы, печатать.
         * Collection, List, Queue, Deque
         * ArrayList, LinkedList, ArrayDeque
         */

        // ArrayList

        ArrayList<String> drinkList = new ArrayList<>();
        ArrayList<String> alcoholList = new ArrayList<>();
        // добавление новых элементов
        drinkList.add("milk");
        drinkList.add("tea");
        drinkList.add("coffee");
        drinkList.add("wiskey");
        alcoholList.add(0, "vodka");
        // вывод в консоль
        System.out.println(drinkList.toString());
        // удаление по индексу
        drinkList.remove(drinkList.size() - 1);
        System.out.println(drinkList.toString());
        drinkList.add("beer");
        System.out.println(drinkList.toString());
        // удаление по значению
        drinkList.remove("beer");
        System.out.println(drinkList.toString());
        drinkList.sort(Comparator.naturalOrder());
        // сортировка массива
        System.out.println(drinkList.toString());
        // печать перебором
        drinkList.stream().forEach(System.out::println);

        // LinkedList

        LinkedList<String> greatingList = new LinkedList<>();
        greatingList.add("привет");
        greatingList.add("как дела?");
        greatingList.add("добрый день");
        greatingList.add("здравствуйте");
        System.out.println(greatingList);
        // добавление в начало
        greatingList.addFirst("чо как?");
        // печать первого значения
        System.out.println(greatingList.peekFirst());

        // DequeList

        Deque<String> chaoDeque = new ArrayDeque<>();
        chaoDeque.add("пока");
        chaoDeque.add("счастливо");
        chaoDeque.add("всего хорошего");
        chaoDeque.add("досвидания");
        chaoDeque.addFirst("удачи"); // добавляем элемент в самое начало
        chaoDeque.addLast("увидимся");
        System.out.println(chaoDeque);
        // перебор коллекции
        while (chaoDeque.peek() != null) {
            // извлечение c начала
            System.out.println(chaoDeque.pop());
        }

        /*
         * 2. Реализовать консольное приложение, которое:
         * Принимает от пользователя строку вида
         * text~num
         * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
         * num.
         * Если введено print~num, выводит строку из позиции num в связном списке и
         * удаляет её из списка.
         * > first~1
         * > third~3
         * > print~1
         * < first
         * > print~2
         * < throw new IllegalArgumentException(); (напечатать, что такого элемента нет)
         */
        LinkedList<String> task2List = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст и число в формате text~num: ");
        // sc.useDelimiter("~");

        String text_ = sc.nextLine();
        System.out.println(text_);

        // sc.close();
        String[] str = text_.split("~");
        System.out.println(Arrays.toString(str));
        String text1 = str[0];
        int index1 = Integer.parseInt(str[1]);
        // Iterator it = task2List.iterator();
        for (int i = 0; i <= index1; i++) {
            if (i != index1) {
                task2List.add(null);
            } else {
                task2List.add(text1);
            }
        }
        System.out.println(task2List.toString());

        while (true) {
            System.out.println(
                    "Введите свой запрос 'example~2' - добавление данных по индексу, 'exit' - выход из программы: ");
            text_ = sc.nextLine();
            str = text_.split("~");
            text1 = str[0];
            index1 = Integer.parseInt(str[1]);
            if (str[0].equals("exit")) {
                break;
            }
            if (str[0].equals("print")) {
                System.out.println(task2List.get(index1));
                task2List.remove(index1);
                System.out.println(task2List.toString());
                continue;
            }
            task2List.add(index1, text1);
            System.out.println(task2List.toString());
        }
        sc.close();
    }
}
