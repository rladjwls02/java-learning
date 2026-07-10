package com.example.demo.Hero;

import lombok.Getter;
import lombok.Setter;

public class DexHero implements Hero {
    @Setter
    @Getter
    private String name;

    public DexHero(String name) {
        this.name = name;
    }
    @Override
    public void attack() {
        System.out.println("Fast Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Lucky Seven");
    }

    @Override
    public void getInformation() {
        System.out.println(this.name);
        ultimate();
        attack();
    }
}
