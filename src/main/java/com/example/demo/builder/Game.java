package com.example.demo.builder;

public class Game {
    static void main() {
        Player player = Player.builder()
                .name("kim")
                .age(15)
                .build();
        System.out.println(player);
    }
}
