package com.example.demo.Hero1;

public class OneCoinGameService implements IGameService {
    private final Hero hero;

    public OneCoinGameService(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void play() {
        System.out.println("---한판하기---");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("---게임오버---");
    }
}
