package com.example.demo.Hero1;

import com.example.demo.Hero.heroes.Hero;
import lombok.Getter;

public class StrengthHero extends BasicHero {

    public StrengthHero(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Bash Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Berserker");
    }

    public void additional() {
        System.out.println("Taunt");
    }
}
