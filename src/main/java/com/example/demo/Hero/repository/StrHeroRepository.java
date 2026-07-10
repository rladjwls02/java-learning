package com.example.demo.Hero.repository;

import com.example.demo.Hero.heros.AgilityHero;
import com.example.demo.Hero.heros.Hero;
import com.example.demo.Hero.heros.StrHero;

public class StrHeroRepository implements HeroRepository {

    private StrHero[] strHeroes = new StrHero[]{
            new StrHero("Slark"),
            new StrHero("Juggernaut"),
            new StrHero("Draw Ranger")
    };
    //메인으로 뺴는거 같았는데?

    @Override
    public Hero findHeroByName(String name) {
        for (StrHero each : strHeroes) {
            if (each!=null) {
                if (each.getName().equals(name)) {
                    return each;
                }
            }
        }
        throw new RuntimeException("당신이 찾는 영웅이 없습니다 : " + name);
    }

    public void delete(String name) {
        for (int i = 0; i < strHeroes.length; i++) {
            if (name.equals(strHeroes[i].getName())) {
                strHeroes[i] = null;
            }
        }
    }
}
