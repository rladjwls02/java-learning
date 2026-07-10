package com.example.demo.assignment;


import lombok.RequiredArgsConstructor;

// @RequiredArgsConstructor //필수적으로 생성해야할 필드를 생성
public class Member {
    private final String citizen;
    private String name;
    private int age;

    public Member(String citizen, String name, int age){
        this.citizen = citizen;
        this.name = name;
        this.age = age;
    }
    public Member(String citizen) {
        this.citizen = citizen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int birthDay() {
        this.age += 1;
        return this.age;
    }


}
