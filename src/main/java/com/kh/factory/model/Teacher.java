package com.kh.factory.model;

public class Teacher implements Person {

    @Override
    public void perform() {
        System.out.println("Teaching");
    }
}
