package com.example.demo.assignment;

import org.apache.catalina.util.ToStringUtil;

public class Game {
    public String[] name;
    int count;

    public Game(String[] name, int count) {

        this.name = name;
        this.count = count;
    }

    public String[] play() {
        System.out.println("---플레이어 목록---");
        for (String n : this.name) {
            System.out.println(n);
        }
        System.out.println(this.count);
        return new String[]{"Kim", "GoodPlayer", "아이템10번씀"};
    }
}
