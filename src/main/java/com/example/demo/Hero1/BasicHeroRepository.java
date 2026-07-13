package com.example.demo.Hero1;

import java.util.Objects;

public abstract class BasicHeroRepository implements HeroRepository {
    private Hero[] heroes;

    public BasicHeroRepository(Hero[] heroes) {
        this.heroes = heroes;
    }

    @Override
    public Hero findHeroByName(String name) {
        for (Hero each : this.heroes) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }

    @Override
    public void create(Hero hero) {
        Hero retrieve = findHeroByName(hero.getName());
        if (Objects.nonNull(retrieve)) {
            throw new RuntimeException("똑같은 이름의 영웅이 이미 있습니다! - 입력받은 영웅 : " + hero.getName());
        }
        Hero[] newheroes = new Hero[this.heroes.length + 1];
        System.arraycopy(this.heroes, 0, newheroes, 0, this.heroes.length);
        newheroes[this.heroes.length] = hero;
        this.heroes = newheroes;
    }

    @Override
    public void delete(String name) {
        Hero retrieve = findHeroByName(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 입력받은 영웅 : " + name);
        }
        byte found = 0;
        Hero[] newheroes = new Hero[this.heroes.length - 1];
        for (int index = 0; index < this.heroes.length; index++) {
            Hero picked = this.heroes[index];
            if (!picked.getName().equals(name)) {
                newheroes[index - found] = this.heroes[index];
            } else {
                found = 1;
            }
        }
    }
}
