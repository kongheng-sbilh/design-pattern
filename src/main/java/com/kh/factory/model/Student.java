package com.kh.factory.model;

public class Student implements Person {

    @Override
    public void perform() {
        System.out.println("Learning");
    }
}