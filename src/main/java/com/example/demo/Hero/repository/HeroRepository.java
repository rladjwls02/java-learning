package com.example.demo.Hero.repository;

import com.example.demo.Hero.heros.Hero;

//영웅 저장소
public interface HeroRepository {
    Hero findHeroByName(String name); //R
    void delete(String name); //D
}
