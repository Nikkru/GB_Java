package seminar_5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class seminar_5_2 {
    public static void main(String[] args) {
        System.out.println(isCorrect("()") + " Should be true");
        System.out.println(isCorrect("())") + " Should be false");
        System.out.println(isCorrect("{()]") + " Should be false");
        System.out.println(isCorrect("[()]") + " Should be true");
        System.out.println(isCorrect("(<>[{}])") + " Should be true");
    }

    private static boolean isCorrect(String sequence) {
        if (sequence.length()%2!=0) {
            return false;
        }
        HashMap<Character, Character> bracketsDic = new HashMap<>();
        bracketsDic.put(')', '(');
        bracketsDic.put(']', '[');
        bracketsDic.put('}', '{');
        bracketsDic.put('>', '<');
        Deque<Character> symbols = new ArrayDeque<>();
        char[] chars = sequence.toCharArray();
        for (char c : chars) {
            if (symbols.isEmpty() || bracketsDic.containsValue(c)) {
                symbols.addFirst(c);
            } else {
                Character closed = symbols.pollFirst();
                Character opened = bracketsDic.get(c);
                if (!closed.equals(opened)) {
                    return false;
                }
                
            }
            // System.out.println(symbols);
        }
        // HashMap<String, String> bracketsDic = new HashMap<>();
        // bracketsDic.put("(", ")");
        // bracketsDic.put("[", "]");
        // bracketsDic.put("<", ">");
        // bracketsDic.put("{", "}");

        // String[] brackets = sequence.split("");
        // System.out.println(Arrays.toString(brackets));
        // // ArrayList<String> brackList = new ArrayList<>(Arrays.asList(brackets));
        // ArrayDeque<String> bd = new ArrayDeque<>();

        // for (int i = 0; i < sequence.length(); i++) {
            
        //     bd.addFirst(brackets[i]);
        //     if (i!=sequence.length()-1 && bd.getFirst() == bracketsDic.get(brackets[i])) {
        //         bd.removeFirst();
        //         bd.removeFirst();
        //     }
        // }
        // if (bd.isEmpty()) {
        //     return true;
        // } else {
        //     return false;
        // }
        return symbols.isEmpty();
    }
}
