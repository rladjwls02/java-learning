package com.example.demo.extend;

import lombok.ToString;

@ToString
public class Child extends Parents {
    String adress;
    int phoneNum;

    @Override
    public void play() {
        System.out.println("신나게 놀기");
    }

    public static void main(String[] args) {
        Parents parents = new Child();
        Child child1 =(Child)parents;
        child1.name = "김어진";
        child1.id = 7;


    }
}
