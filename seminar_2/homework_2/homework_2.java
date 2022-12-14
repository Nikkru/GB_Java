package seminar_2.homework_2;

public class homework_2 {
    public static void main(String[] args) {
        /*
        * 1. Напишите метод, который принимает на вход строку (String) и
        * определяет является ли строка палиндромом (возвращает boolean значение).
        * шалаш
        * abcdedcba
         */
        String str1 = "шалаш";
        String str2 = "abcdedcba";
        
        System.out.println(isPolindrom(str1));
    }

    private static String isPolindrom(String str) {
        System.out.println("Задание №1.");
        String isPolindrom = "";
        for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--){
            if (str.charAt(i) != str.charAt(j)) {
                isPolindrom = "строка '" + str + "' не является полиндроном";
            } else {
                isPolindrom = "строка '" + str + "' полиндром";
            }
        }
        return isPolindrom;
}
}
