package com.example.demo.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OneCoinGameService implements IGameService{
    private final Hero hero;

    @Override
    public void play() {
        System.out.println("---한판하기---");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("---게임오버---");
    }
}
