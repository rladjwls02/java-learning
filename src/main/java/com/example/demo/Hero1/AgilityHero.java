package com.example.demo.Hero1;

// Concrete 구현체 = class < implements Hero
public class AgilityHero extends BasicHero {

    public AgilityHero(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Fast Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Evasion");
    }
}
