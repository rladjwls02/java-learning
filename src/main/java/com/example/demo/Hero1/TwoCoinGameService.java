package com.example.demo.Hero1;

//@RequiredArgsConstructor
public class TwoCoinGameService implements IGameService{
    private final Hero hero;

    public TwoCoinGameService(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void play() {
        System.out.println("---두판하기---");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("---게임이어하기---");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("---게임 오버---");
    }
}
