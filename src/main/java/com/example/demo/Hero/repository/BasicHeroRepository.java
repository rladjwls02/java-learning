package com.example.demo.Hero.repository;

import com.example.demo.Hero.heros.BasicHero;
import com.example.demo.Hero.heros.Hero;

public abstract class BasicHeroRepository implements HeroRepository {
    //final 쓰는이유는 메모리 주소값은 불변하기때문에
    private final Hero[] heroes; //무조건 다형성은 클래스말고 인터페이스로 하셈 아니면 총 맞을 수도

    public BasicHeroRepository(Hero[] heroes) {
        this.heroes = heroes;



        //str, agility repository CRUD만들기
    }

}
