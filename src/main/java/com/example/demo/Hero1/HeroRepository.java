package com.example.demo.Hero1;

public interface HeroRepository {
    // 영웅 이름을 기반으로 영웅을 찾아서 반환합니다
    Hero findHeroByName(String name);

    default void create(Hero hero) {
        throw new RuntimeException("create 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
    default Hero update(Hero hero) {
        throw new RuntimeException("update 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
    default void delete(String name) {
        throw new RuntimeException("delete 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
}
