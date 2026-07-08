package com.example.demo.game;

public class GameMain {
    static void main(String[] args) {


        Hero selectedHero = new StrHero();
        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();
        selectedHero.additional();

    }
}
