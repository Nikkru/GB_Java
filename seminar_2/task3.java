package seminar_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class task3 {
    /*
     * 1. напишите метод, который вернет содержимое текущей папки в виде строк.
     * 2. напишите метод. который запишет массив, возвращенный предыдущим методом в файл.
     * 3. Обработайте ошибки с помощью try-catch конструкции. В случее возникновения исключений,
     * они должны записываться в лог-файл.
     */
    public static void main(String[] args) throws IOException {

// создать интерфейс с именем и местом расположения файла
        Path file = Paths.get("seminar_2/dir/file.txt");
        System.out.println(file.getFileName().toString());
        // проверить существования данного файла
        System.out.println(Files.exists(file));

// cоздать новый файл 
        // Path newFile = Paths.get("seminar_2/dir/newFile.txt");
        // Files.createFile(newFile);

        // прочитать файл
        List<String> result = Files.readAllLines(file);
        System.out.println(result);
        // Files.writeString(file, "new content");

        BufferedWriter bufferedWriter = Files.newBufferedWriter(file);
        bufferedWriter.append("new content");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = Files.newBufferedReader(file);
        String n = bufferedReader.readLine();
        System.out.println(n);

  

    }
}
