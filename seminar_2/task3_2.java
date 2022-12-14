package seminar_2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class task3_2 {
    public static void main(String[] args) throws IOException {
              // Task 3
        // Напишите код, который вернет содержимое текущей папки в видде массива строк.
        // Напишите метод, который запишит массив, возвращенный предыдущим методом в файл.
        Path dir_info = Paths.get("task3File.txt");
        if (!Files.exists(dir_info)){
            Files.createFile(dir_info);
        } else {
            System.out.println("Файл уже существует");
        }
        
        Path file = Paths.get("");

        System.out.println(dir_info.toAbsolutePath());
        List<Path> Directories = Files.list(file).collect(Collectors.toList());
        List<String> str = new ArrayList<>();
        int dirSize = Directories.size();
        // StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < dirSize; i++){
            Path p = Directories.get(i);
            str.add(p.toString());
        }
        BufferedWriter bufferedWriter = Files.newBufferedWriter(dir_info);
        try{
            // bufferedWriter.append(str.toString());
            // bufferedWriter.flush();
            // bufferedWriter.close();
            Files.write(dir_info, str);
        } catch(IOException e) {

        }
       
    }
}
