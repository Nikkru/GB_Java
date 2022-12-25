package seminar_5.homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public Map<String, List<String>> storage = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        if (!storage.containsKey(surname)) {
            storage.put(surname, numbers);
        } else {
            storage.get(surname).add(phoneNumber);
        }
    }
    public List<String> getBySurname(String surname) {
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < storage.get(surname).size(); i++) {
            numbers.add(storage.get(surname).get(i));
        }
        return numbers;
    }
    public void printMap(Map<String, List<String>> storage2){
        for (String key : storage2.keySet()) {
            System.out.println(key + " : " + storage.get(key));
        }
    }
}
