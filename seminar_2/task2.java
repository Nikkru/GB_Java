package seminar_2;

public class task2 {
    public static void main(String[] args) {
        /*
         * напишите метод, который сжимает строку.
         * aaaabbbcdd -> a4b3c1d2
         */
        String s = "aaaabbbcdd";
        String new_s = compress(s);
        System.out.println(new_s);
    }


private static String compress(String source){
    StringBuilder str = new StringBuilder();
    int count = 1;
    char simple = source.charAt(0);
    for(int i = 1; i < source.length(); i++){
        if (source.charAt(i) == simple){
            count++;
        } else {
                str.append(simple).append(count);
                simple = source.charAt(i);
                count = 1;
        }
    }
    str.append(simple).append(count);
    return str.toString();
   }
}