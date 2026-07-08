package com.example.demo.game;

public class StrHero implements Hero{
    @Override
    public void attack() {
        System.out.println("Fianl Attack");
    }

    @Override
    public void ultimate() {
    }

    public void additional() {
        System.out.println("Berserker");
    }
}
