import java.text.BreakIterator;
import java.util.Scanner;
class homework_1 {  
    public static void main(String[] args) {
        
        System.out.println(is_Sum_In_Range(
            2, 
            3, 
            10, 
            20));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        what_number(number);
        

        Scanner in_2 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number_1 = in_2.nextInt();
        if (number_1 == 0) {
            System.out.println(number_1 + " не подходящее во условию ввода число");
        } else {
            System.out.println("Число " + number_1 + " - " + is_Number(number));
        }
        
    }
    
    /*
        Задача 1.
        Написать метод, принимающий на вход два целых числа и проверяющий, 
        что их сумма лежит в пределах от 10 до 20 (включительно), 
        если да – вернуть true, в противном случае – false.
     */
    private static boolean is_Sum_In_Range( int num_1, 
                                            int num_2, 
                                            int range_from, 
                                            int range_to) {
        System.out.println("Задание №1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false");
        return range_from <= num_1 + num_2 && num_1 + num_2 <= range_to;
    }
    /*
        Задача 2.
        Написать метод, которому в качестве параметра передается целое число, 
        метод должен напечатать в консоль, 
        положительное ли число передали или отрицательное. 
        Замечание: ноль считаем положительным числом.
     */

    private static void what_number(int num) {
        System.out.println("Задание №2.");
        if (num < 0) {
            System.out.println("Введенное Вами число: " + num + " -- отрицательное");
        } else if (num >= 0) {
            System.out.println("Введенное Вами число: " + num + " -- положительное");
        } else {
            System.out.println("Введены некорректные данные");
        }
    }

    /*
        Задача 3.
        Написать метод, которому в качестве параметра передается целое число. 
        Метод должен вернуть true, если число отрицательное, 
        и вернуть false если положительное.
     */

    private static boolean is_Number(int num) {
        System.out.println("Задание №3.");
        boolean isNum;
        if (num < 0) {
            isNum = true;
            return isNum;
        } else {
            isNum = false;
            return isNum;
        } 
    }

}