package com.kh.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
            .setId(1L)
            .setName("ABC")
            .setAddress("Phnom Penh")
            .setAge(12)
            .build();
        System.out.println(person.toString());
    }
}
