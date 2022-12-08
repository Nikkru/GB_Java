class homework_1 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий на вход два целых числа и проверяющий, 
        что их сумма лежит в пределах от 10 до 20 (включительно), 
        если да – вернуть true, в противном случае – false.
         */
        System.out.println(is_Sum_In_Range(
            2, 
            3, 
            10, 
            20)); 
    }
    
    private static boolean is_Sum_In_Range( int num_1, 
                                            int num_2, 
                                            int range_from, 
                                            int range_to) {
        System.out.println("Задание №1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false");
        return range_from <= num_1 + num_2 && num_1 + num_2 <= range_to;
    }
}