package com.example.demo.member;

public class Member {
     private Integer id;
     private String name;
     private int age;


    public Member(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
