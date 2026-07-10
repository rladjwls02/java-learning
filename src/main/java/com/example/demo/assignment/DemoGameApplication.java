package com.example.demo.assignment;

import static com.example.demo.assignment.DemoApplication.play;

public class DemoGameApplication {
    static void main(String[] args) {
        // *** 변수 할당부 ***
//        name = new String[]{ "Aaron", "Baron" };
//        count = 3;
        String[] name = {"Aaron", "Baron" };
        Game game = new Game(name, 3);

        // 게임을 플레이하고
        //TODO: 절차지향 언어와 다른점 왜 이렇게 쓰는지 설명할수있기
        //TODO: 디스코드에서 원본을 찾아보자...
        String[] result = game.play();
        // 결과를 반환한다
        System.out.println("--- 결과출력 ---");
        System.out.println(result);
    }
}
