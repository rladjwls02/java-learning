package com.example.demo.Hero.heros;

public class StrHero extends BasicHero {


    public StrHero(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Fianl Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Berserker");
    }
//    @Override
//    public void getInformation() {
//        System.out.println(this.name);
//        additional();
//        attack();
//    }
}
