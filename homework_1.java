import java.sql.Array;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Scanner;
class homework_1 {  
    public static void main(String[] args) {
// Task 1.    
        System.out.println(is_Sum_In_Range(
            2, 
            3, 
            10, 
            20));
// Task 2.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        what_number(number);

// Task 3.
        Scanner in_2 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number_1 = in_2.nextInt();
        if (number_1 == 0) {
            System.out.println(number_1 + " не подходящее во условию ввода число");
        } else {
            System.out.println("Число " + number_1 + " - " + is_Number(number_1));
        }
// Task 4.
        Scanner in_3 = new Scanner(System.in);
        System.out.print("Введите строку для вывода в консоль: ");
        String string_1 = in_3.nextLine();
        
        Scanner in_4 = new Scanner(System.in);
        System.out.print("Введите число повторений вывода строки в консоль: ");
        int number_2 = in_4.nextInt();

        print_String(number_2, string_1);
// Task 5.
        Scanner in_5 = new Scanner(System.in);
        System.out.print("Введите год, чтобы узнать високосный ли он: ");
        int year_ = in_5.nextInt();
        System.out.println(year_ + " это високосный год - " + is_Year(year_));
// Task 6.
// заполняем массив 0 и 1 для конвертации
        int number_;  
        Scanner obj = new Scanner(System.in);  
        System.out.print("Введите размер массива: ");    
        number_= obj.nextInt();    
        int[] array = new int[number_];  
        System.out.println("Заполните массив значениями 0 или 1: ");  
        for(int i=0; i<number_; i++)  
        {     
            array[i] = obj.nextInt(); //reads elements from the user 
        }   
        System.out.println(Arrays.toString(array)); 
        array = inversion_booling(array);
        System.out.println(Arrays.toString(array));

// Task 7.
// Задайте величину массива для заполнения его порядковыми числами
        Scanner in_6 = new Scanner(System.in);  
        System.out.print("Введите размер массива: ");    
        int size = in_6.nextInt();
        int a[] = make_array(size);
        System.out.println(Arrays.toString(a));
// Task 8.
        int[] ar = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(ar));
        ar = change_array(ar);
        System.out.println(Arrays.toString(ar));

// Task 9
//  Ввести размер двумерного квадратного массива 
        Scanner in_7 = new Scanner(System.in);  
        System.out.print("Введите размер массива: ");    
        int size_ = in_7.nextInt();
        make_td_array(size_);

// Task 10.
// Введите размер требуемого массива и значение для инициализации
        Scanner in_8 = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = in_8.nextInt();
        System.out.print("Введите значение для заполнения массива: ");
        int initial_value = in_8.nextInt();
        int[] new_arr = make_new_array(len, initial_value);
        System.out.println(Arrays.toString(new_arr));
/*
 * Task 11.
 * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 */
        int[] old_arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max_ = old_arr[1];
        int min_ = old_arr[1];
        for (int d : old_arr) {
            max_ = d > max_ ? d : max_;
            min_ = d < min_ ? d : min_;
        }
        System.out.print("Наибольшее число массива: " + max_ + ". Наименьшее число массива: " + min_ + "\n");
    

        in.close();
        in_2.close();
        in_3.close();
        in_4.close();
        in_5.close();
        obj.close();
        in_6.close();
        in_7.close();
        in_8.close();
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

    /*
    Задание 4. 
    Написать метод, которому в качестве аргументов передается строка и число, 
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    private static void print_String(int num, String str) {
        System.out.println("Задание №4.");
        for (int i = 0; i < num; i++) {
            System.out.println((i+1) + ". " + str);
        }
    }
    /*
     * Задание №5.
     * Написать метод, который определяет, является ли год високосным, 
     * и возвращает boolean (високосный - true, не високосный - false). 
     * Каждый 4-й год является високосным, кроме каждого 100-го, 
     * при этом каждый 400-й – високосный.
     */
    private static boolean is_Year(int year) {
        System.out.println("Задание №5.");
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    /*
     * Задание №6.
     * Задать целочисленный массив, состоящий из элементов 0 и 1. 
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static int[] inversion_booling(int[] arr) {
        System.out.println("Задание №6.");
        int[] a = new int[arr.length];
        int i = 0;
        for (int d : arr) {
            if (d == 0 | d == 1) {
                d = (d > 0) ? 0 : 1;
                a[i] = d;
                i++;
            } else {
                a[i] = d;
                i++;
            }
        }
        return a;
    }
    /*
    * Task 7.
     * Задать пустой целочисленный массив длиной 100. 
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    private static int[] make_array(int n) {
        System.out.println("Задание №7.");
        int[] a = new int[n];
        int i = 1;
        for (int _ : a) {
            a[i-1] = i++;
        }
        return a;
    }
    /*
    * Task 8.
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static int[] change_array(int[] arr) {
        System.out.println("Задание №8.");
        int i = 0;
        for (int d : arr) {
            if (d < 6) {
                arr[i] = d * 2;
                i++;
            } else {
                i++;
            }
            }
        return arr;
    }
     /*
     * Task 9.
     * Создать квадратный двумерный целочисленный массив 
     * (количество строк и столбцов одинаковое), 
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
     * (можно только одну из диагоналей, если обе сложно). 
     * Определить элементы одной из диагоналей можно по следующему принципу: 
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    private static int[][] make_td_array(int n) {
        System.out.println("Задание №8.");
        int[][] td_array = new int[n][n];
        for (int i = 0; i < td_array.length; i++){
            for(int j = 0; j < td_array[i].length; j++){
               if ((i==j) | (i+j==td_array.length-1)) {
                   td_array[i][j] = 1;
               }
                System.out.printf("%d ", td_array[i][j]);
            }
            System.out.println();
        }
        return td_array;
    }
     /*
     * Task 10.
     * Написать метод, принимающий на вход два аргумента: len и initialValue, 
     * и возвращающий одномерный массив типа int длиной len, 
     * каждая ячейка которого равна initialValue;
     */
    private static int[] make_new_array(int len, int initialValur) {
        System.out.println("Задание №9.");
        int[] td_array = new int[len];
        for (int i = 0; i < td_array.length; i++){
            td_array[i] = initialValur;
            System.out.println();
        }
        return td_array;
    }

         /*
     * Task 11.
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    private static int[] make_new__array(int len, int initialValur) {
        System.out.println("Задание №9.");
        int[] td_array = new int[len];
        for (int i = 0; i < td_array.length; i++){
            td_array[i] = initialValur;
            System.out.println();
        }
        return td_array;
    }
}
