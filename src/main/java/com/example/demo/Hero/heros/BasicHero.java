package com.example.demo.Hero.heros;

import lombok.Getter;

@Getter
public abstract class BasicHero implements Hero{
    //여기에 네임이란 필드,생성자 를 두기 얘네를 각 힘,민첩 영웅들이 가져다씀
    //여기에 생성자도 만들어서 각 영웅들이 super생성자를 가져다옴

    //name 가져다쓰면 각 영웅들에서 name필드가 필요한가?
    //근데 여기에 우리는 이름 필드를 인터페이스에 넣을 수 없으니까 추상클래스를 새로만든겨
    //그래서 인터페이스에 있는 메서드 그냥 가만히 냅두면 2단 상속되서 손자 클래스에서 구현댐
    public String name;

    public BasicHero(String name) {
        this.name = name;
    }



}
