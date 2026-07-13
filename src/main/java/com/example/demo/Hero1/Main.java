package com.example.demo.Hero1;

public class Main {
    static void main(String[] args) {
        HeroRepository heroRepository = new AgilityHeroRepository(
                new AgilityHero[]{
                        new AgilityHero("Slark"),
                        new AgilityHero("Drow Ranger"),
                        new AgilityHero("Slardar")
                }


        );
        Hero selectedHero = heroRepository.findHeroByName("Slark");
//        IGameService gameService = new TwoCoinGameService(selectedHero);
    }
}
