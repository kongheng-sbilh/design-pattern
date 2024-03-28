package com.kh.builder;

public class Person {

    private final Long id;
    private final String name;
    private final int age;
    private final String address;

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private Person(PersonBuilder personBuilder) {
        this.id = personBuilder.getId();
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }

    public static class PersonBuilder {

        private Long id;
        private String name;
        private int age;
        private String address;

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public PersonBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
