package com.example.demo.extend;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Parents {
    int id;
    String name;

    public void play() {
        System.out.println("지루하게 놀기");
    }

    public void onlyParents() {
        System.out.println("부모에만 있는거");
    }
}
