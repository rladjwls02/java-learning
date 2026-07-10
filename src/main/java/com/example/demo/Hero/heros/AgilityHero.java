package com.example.demo.Hero.heros;

public class AgilityHero extends BasicHero {

//    @Setter
//    @Getter
//    private String name;

//    public DexHero(String name) {
//        this.name = name;
//    }

    public AgilityHero(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Fast Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Lucky Seven");
    }

//    @Override
//    public void getInformation() {
//        System.out.println(this.name);
//        ultimate();
//        attack();
//    }
}
