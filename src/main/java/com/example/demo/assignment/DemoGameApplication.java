package com.example.demo.assignment;

public class DemoGameApplication {
    static void main(String[] args) {
        String[] player = {"Kim", "Lee"};
        Game game = new Game(player, 4);

        String[] result = game.play();
        System.out.println("---결과 출력---");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
