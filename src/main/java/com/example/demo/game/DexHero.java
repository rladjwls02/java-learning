package com.example.demo.game;

public class DexHero implements Hero {
    @Override
    public void attack() {
        System.out.println("Fast Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Lucky Seven");
    }
}
