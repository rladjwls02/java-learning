package com.example.demo.extend;

public class Child extends Parents {
    String adress;
    int phoneNum;

    @Override
    public void play() {
        System.out.println("신나게 놀기");
    }

    public static void main(String[] args) {
        Child boy = new Child();
        boy.id = 332;
        boy.name ="김어진";
        boy.adress = "서울시 양천구";
        boy.phoneNum = 7151;

        boy.play();
        boy.onlyParents();

        Parents boy2 = new Child();
        boy2.play();
        boy2.onlyParents();

        Parents boy3 = new Parents();
        boy3.play();
        boy3.onlyParents();

    }
}
