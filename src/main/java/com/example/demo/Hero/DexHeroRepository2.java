package com.example.demo.Hero;

public class DexHeroRepository2 implements HeroRepository {

    private DexHero[] dexHeroes = new DexHero[]{
            new DexHero("Slark"),
            new DexHero("Juggernaut"),
            new DexHero("Draw Ranger")
    };

    @Override
    public Hero findHeroByName(String name) {
        for (DexHero each : dexHeroes) {
            if (each == null) {
                System.out.println("널값출력");
            } else if (each.getName().equals(name)) {
                return each;
            }
        }
        throw new RuntimeException("당신이 찾는 영웅이 없습니다 : " + name);
    }

//    public void delete(String name) {
//        for (DexHero each : dexHeroes) {
//            if (each.getName().equals(name)) {
//                dexHeroes = null;
//            }
//        }
//        throw new RuntimeException("당신이 찾는 영웅이 없습니다 : " + name);
//    }

    public void delete(String name) {
        for (int i = 0; i < dexHeroes.length; i++) {
            if (name.equals(dexHeroes[i].getName())) {
                dexHeroes[i] = null;
            }
        }
    }
}
