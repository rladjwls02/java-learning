package com.example.demo.Hero.repository;

import com.example.demo.Hero.heros.AgilityHero;
import com.example.demo.Hero.heros.BasicHero;
import com.example.demo.Hero.heros.Hero;

public class AgilityHeroRepository extends BasicHeroRepository {

    public AgilityHeroRepository(Hero[] heroes){
        super(heroes);
    };
    //메인으로 뺴는거 같았는데?

    @Override
    public Hero findHeroByName(String name) {
        for (BasicHero each : heroes) {
            if (each!=null) {
                if (each.getName().equals(name)) {
                    return each;
                }
            }
        }
        throw new RuntimeException("당신이 찾는 영웅이 없습니다 : " + name);
    }

    public void delete(String name) {
        for (int i = 0; i < agilityHeroes.length; i++) {
            if (name.equals(agilityHeroes[i].getName())) {
                agilityHeroes[i] = null;
            }
        }
    }
}
