package com.example.demo.Hero;

import com.example.demo.Hero.heros.Hero;
import com.example.demo.Hero.repository.AgilityHeroRepository;
import com.example.demo.Hero.repository.HeroRepository;

public class GameMain {
    static void main(String[] args) {


        HeroRepository heroRepository = new AgilityHeroRepository();
        heroRepository.delete("Slark");
        Hero selectedHero = heroRepository.findHeroByName("Draw Ranger");





        //selectedHero.getInformation();
    }
}
