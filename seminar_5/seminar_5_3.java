package seminar_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class seminar_5_3 {
    public static void main(String[] args) {
        
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        sortByLenth(text);
    }
    private static void sortByLenth(String txt) {
            String[] words = txt.split(" ");
            Map<Integer, List<String>> treeMap = new TreeMap<>();
            for (int i = 0; i < words.length; i++) {
                int len = words[i].length();
                if (!treeMap.containsKey(len)) {
                    List<String> arr = new ArrayList<>();
                    arr.add(words[i]);
                    treeMap.put(len, arr);
                } else {
                    List<String> arr = treeMap.get(len);
                    arr.add(words[i]);
                    treeMap.put(len, arr);
                }
            }
            List<String> newArr = new ArrayList<>();
            for (int key : treeMap.keySet()) {
                newArr.addAll(treeMap.get(key));
            }
            System.out.println(newArr);
            System.out.println(treeMap);
    }
}
