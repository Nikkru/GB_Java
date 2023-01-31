package oop.lesson_05.Phonebook.Core.Interface;

import oop.lesson_05.Phonebook.Core.Models.Contact;
import oop.seminar_4.WildcardMain;

import java.util.List;

public interface Phonebook_ {
    List contacts();
    void add(WildcardMain.E e);
}
