package com.example.demo.Hero;

public class StrHero implements Hero{
    private String name;

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

    @Override
    public void getInformation() {
        System.out.println(this.name);
        additional();
        attack();
    }
}
