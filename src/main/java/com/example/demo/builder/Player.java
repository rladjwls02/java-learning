package com.example.demo.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Player {
    private String name;
    private int age;
    private String address;
    private int winCount =0 ;
    private int failCount=0 ;

    @Builder
    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
