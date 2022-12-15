package seminar_2.homework_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class homework_2 {
    public static void main(String[] args) throws IOException {
        /*
        * 1. Напишите метод, который принимает на вход строку (String) и
        * определяет является ли строка палиндромом (возвращает boolean значение).
        * шалаш
        * abcdedcba
         */
        String str1 = "шалаш";
        String str2 = "abcdedcba";
        
        System.out.println(isPolindrom(str1));
        /*
         * 2. Напишите метод, который определит тип (расширение) файлов из текущей папки
         * и выведет в консоль результат вида
         * 1 Расширение файла: txt
         * 2 Расширение файла: pdf
         * 3 Расширение файла:
         * 4 Расширение файла: jpg
         */
        Path file = Paths.get("");
        List<Path> Directories = Files.list(file).collect(Collectors.toList());
        List<String> str = new ArrayList<>();
        System.out.println(Directories);
        int directoriesSize = Directories.size();
        for (int i = 0; i < directoriesSize; i++){
            Path p = Directories.get(i);
            str.add(p.toString());
        }
        for(String s : str){
            int index = s.lastIndexOf(".");
            if (index > 0){
                String extension = s.substring(index + 1);
                System.out.println("Расширение файла:" + extension);
            }
        }
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
    private static void getAllFiles(String path) {
        File[] allFiles = new File(path).listFiles();
        if (allFiles != null) {
            for (File file : allFiles) {
                String fileName = file.toString();
                int index = fileName.lastIndexOf('.');
                if(index > 0) {
                    String extension = fileName.substring(index + 1);
                    System.out.println("Расширение файла:" + extension);
                }
            }
        }
}
}
