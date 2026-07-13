package com.example.demo.Hero1;


public abstract class BasicHero implements Hero {
    private final String name; // 공통 필드

    public BasicHero(String name) {
        this.name = name;
    }

    @Override                  // Hero 인터페이스 내 getName 추상 메서드를 여기서 구현
    public String getName() {  // 공통 메서드
        return this.name;
    }
}
