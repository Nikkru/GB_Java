package oop.seminar_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Human hi = s1;
        Object o1 = hi;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> emplyees = new ArrayList<>();
        students.add(new Student());
        students.add(new Emplyee());
        emplyees.add(new Emplyee());
        emplyees.add(new Emplyee());
        System.out.println(hi.name);
        System.out.println(((Student) hi).name);
        System.out.println(hi.getClass().getSimpleName());
        System.out.println(hi.getClass().getName());
        print(students);
        print(emplyees);
    }

    public static void print(ArrayList<? extends Student> list) {
        list.forEach(System.out::println);
    }
}
class  Human {
    String name = "Hob";
}
class  Student extends  Human {
    String name = "Sob";
    int id = 100;
}

class  Emplyee extends  Student {

}