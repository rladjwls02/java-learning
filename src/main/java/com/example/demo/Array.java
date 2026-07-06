package com.example.demo;

import java.util.Arrays;

public class Array {
    static void main() {
        //String[] string_array = new String[3];

        String[] string_array = new String[]{"1", "2", "3"}; //배열생성 및 초기화
        System.out.println(string_array.length); //배열의 갯수 출력

        Integer[] intger_array = {1, 2, 3};
        System.out.println(intger_array.length);

        System.out.println("참조하는 메모리 출력");
        System.out.println(string_array);
        System.out.println(intger_array); //

        int[] num_array = {1, 2, 3, 4, 5};
        for (int i = 0; i < num_array.length; i++) {
            System.out.println(num_array[i]);
            System.out.println(Arrays.toString(num_array));
        }

        //고차원 배열
        User[] users = {
                new User(1, "김어진1"),
                new User(2, "김어진2"),
                new User(3, "김어진3"),
                new User(4, "김어진4"),
        };
        int[][] leecha = {
                {3, 4, 5, 6},
                {7, 8, 9, 10},
                {1, 2, 3, 4}
        };
        for (int i = 0; i < leecha.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(leecha[i][j]);
            }
            System.out.println(" ");
        }
    }
}
