package com.example.demo.assignment;

public final class DemoApplication {

    public static String[] play(String[] name, int count) {
        System.out.println("--- 플레이어들 ---");
        for (String each : name) {
            System.out.println(each);
        }
        System.out.println("--- 게임끝 ---");
        return new String[]{ "Aaron", "2시 10분 10초", "아이템 사용 총 10건" };
    }

    // 카트라이더 자동차 레이싱 게임
    public static void main(String[] args) {
        // *** 변수 선언부 ***
        // 자동차 닉네임들을 데이터를 받고
        String[] name;
        // 몇 판을 할지 데이터를 받고
        int count;

        // *** 변수 할당부 ***
        name = new String[]{ "Aaron", "Baron" };
        count = 3;

        // 게임을 플레이하고
        String[] result = play(name, count);
        // 결과를 반환한다
        System.out.println("--- 결과출력 ---");
        System.out.println(result);
    }
}
