package com.example.demo.assignment;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class MemberRefactor {
    final String citizen;
    String name;
    int age;

//    public MemberRefactor(String citizen) {
//        this.citizen = citizen;
//    }

//    public MemberRefactor(String citizen, String name, int age) {
//        this.citizen = citizen;
//        this.name = name;
//        this.age = age;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    @Override
//    public String toString() {
//        return "Name: " + name
//                + " age: " + age;
//    }
}
