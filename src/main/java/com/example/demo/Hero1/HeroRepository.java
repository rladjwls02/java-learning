package com.example.demo.Hero1;

public interface HeroRepository<T extends Hero> extends CrudRepository<T> {
    void create(T hero); 
}
