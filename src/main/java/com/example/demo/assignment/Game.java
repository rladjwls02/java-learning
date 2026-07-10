package com.example.demo.assignment;

import org.apache.catalina.util.ToStringUtil;

public class Game {
    String[] name;
    int count;

    public Game(String[] name, int count) {

        this.name = name;
        this.count = count;
    }

    public String[] play() {
        for (String each : this.name) {
            System.out.println(each);
        }
        System.out.println(count);
        return new String[]{"우승자는: 애란","LapTime: 11:04","아이템 사용횟수3" };
    }

}