package seminar_2;

public class seminar_2 {
    public StringBuilder buildString(int n, char c1, char c2){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s.append(c1);
            } else {
                s.append(c2);
            }
        }
        return s;
    }
}

