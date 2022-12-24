package seminar_5;

import java.util.HashMap;
import java.util.Map;

public class seminar_5 {
    public static void main(String[] args) {
        System.out.println(isIsomorph("foo", "bar") + " should be true");
        System.out.println(isIsomorph("foo", "bao") + " should be fals");
        System.out.println(isIsomorph("note", "code") + " should be true");
    }
    private static boolean isIsomorph(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> words = new HashMap<>();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (int i =0; i < chars1.length; i++) {
            char first = chars1[i];
            char second = chars2[i];
            if (!words.containsKey(first)) {
                words.put(first, second);
                // Character value = words.get(first);
                // if (str2.charAt(i) != value) {
                
            } else if (words.get(first) != second) {
                return false;
            } 
        }
        return true;
    }
}
