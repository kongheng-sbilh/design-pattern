package com.kh.factory.factory;

import com.kh.factory.constant.PersonType;
import com.kh.factory.model.Person;
import com.kh.factory.model.Student;
import com.kh.factory.model.Teacher;

public class PersonFactory {

    public static Person getPerson(PersonType type) {
        return switch (type) {
            case STUDENT -> new Student();
            case TEACHER -> new Teacher();
        };
    }
}
