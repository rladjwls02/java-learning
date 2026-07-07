package com.example.demo;

import lombok.EqualsAndHashCode;


public class LombokMain {
    static void main() {
        LombokClass person = new LombokClass("김어진", 25);
        System.out.println("Getter");
        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println("Setter");
        person.setName("김어진2");
        person.setAge(25);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println(person);

        LombokClass person2 = new LombokClass("김어진3", 25);
        System.out.println(person.equals(person2));
    }
}
