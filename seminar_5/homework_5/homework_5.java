package seminar_5.homework_5;
/**
 * Реализовать телефонный справочник.
 * В справочнике есть фамилии и номера телефонов.
 * В справочнике обычно ищем номер по фамилии.
 * При этом могут быть однофамильцы -> за одной фамилией скрывается несколько номеров
 * <p>
 * Пример
 * "Иванов", "123456"
 * "Васильев", "321456"
 * "Петрова", "234561"
 * "Иванов", "234432"
 * "Петрова", "654321"
 * "Иванов", "345678"
 * <p>
 * Вывести номера по фамилии Иванов.
 */
public class homework_5 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "1234567");
        phoneBook.add("Петров", "3214567");
        phoneBook.add("Кузмин", "5634567");
        phoneBook.add("Иванов", "9234512");
        phoneBook.add("Симоян", "7564567");
        phoneBook.add("Жуков", "8674567");
        phoneBook.add("Энтин", "3424567");
        phoneBook.add("Борисова", "7684567");
        phoneBook.add("Иванов", "00345324");

        System.out.println(phoneBook.getBySurname("Иванов"));
        phoneBook.printMap(phoneBook.storage);
    }
    
}
