package com.example.demo.Hero;

//영웅 저장소
public interface HeroRepository {
    Hero findHeroByName(String name);

    void delete(String name);
}
