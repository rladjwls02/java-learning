package com.example.demo.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@AllArgsConstructor
@ToString
public class Player {
    private String name;
    private int age;
    private String address;
    private int winCount;
    private int failCount;

}
