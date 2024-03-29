package com.kh.factory;

import com.kh.factory.factory.PersonFactory;
import com.kh.factory.model.Person;

import static com.kh.factory.constant.PersonType.STUDENT;
import static com.kh.factory.constant.PersonType.TEACHER;

public class Main {
    public static void main(String[] args) {
        Person person1 = PersonFactory.getPerson(STUDENT);
        Person person2 = PersonFactory.getPerson(TEACHER);
        person1.perform();
        person2.perform();
    }
}
