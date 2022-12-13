package seminar_2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class task3 {
    /*
     * 1. напишите метод, который вернет содержимое текущей папки в виде строк.
     * 2. напишите метод. который запишет массив, возвращенный предыдущим методом в файл.
     * 3. Обработайте ошибки с помощью try-catch конструкции. В случее возникновения исключений,
     * они должны записываться в лог-файл.
     */
    public static void main(String[] args) {
        Path file = Paths.get("dir" + File.separator + "file.txt");
        System.out.println(file.getFileName().toString());
    }
}
