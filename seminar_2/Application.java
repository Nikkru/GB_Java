package seminar_2;

class Application {
    public static void main(String[] args) {
        /*
         * дано четное число и смволы с1 и с2.
         * написать метод, который вернет строку длиной в число.
         * которая состоит из чередующихся символов с1 и с2, начиная с сш
         */
        seminar_2 seminar2 = new seminar_2();
        
        StringBuilder result = seminar2.buildString(20, 'a', 'b');
        System.out.println(result);
    }
}