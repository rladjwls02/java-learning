package com.example.demo.Hero1;

public class AgilityHeroRepository extends BasicHeroRepository<AgilityHero> {

    public AgilityHeroRepository(AgilityHero[] heroes) { // <- 강제됨 / 미친척하고 StrengthHero[] 입력 못함
        super(heroes);
    }
}