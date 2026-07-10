package com.example.demo.Hero;

public class GameMain {
    static void main(String[] args) {


        HeroRepository heroRepository = new DexHeroRepository();
        heroRepository.delete("Slark");
        Hero selectedHero = heroRepository.findHeroByName("Draw Ranger");
        selectedHero.getInformation();
    }
}
