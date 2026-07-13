package com.example.demo.Hero1;

public class Main {
    public static void main(String[] args) {

        CrudRepository<AgilityHero> crudRepository = new AgilityHeroRepository(
                new AgilityHero[]{
                        new AgilityHero("Slark"),
//                        new StrengthHero("Slardar"),            // 문제 1 해결
                        new AgilityHero("Drow Ranger"),
                }
        );
//        crudRepository.create(new StrengthHero("ASDJIOSANMD"));    // 문제 2 해결
        crudRepository.create(new AgilityHero("HDoemd"));
        crudRepository.delete("Slark");
        Hero selectedHero  = crudRepository.findByName("Drow Ranger");

        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();
    }
}
