package com.example.demo.builder;

public class Game {
    static void main() {
        String request = "이영철";

        Player.PlayerBuilder playerBuilder = Player.builder();

        playerBuilder
                .name("김어진")
                .address("서울시")
                .winCount(4);


        if (request.equals("김어진")){
            playerBuilder.age(25)
                         .failCount(99);
        } else {
            playerBuilder
                    .name("Unknoewn")
                    .age(42)
                    .failCount(1);
        }
        Player kim = playerBuilder.build();

        System.out.println(kim);
    }
}
