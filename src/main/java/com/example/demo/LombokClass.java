package com.example.demo;

import lombok.*;
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter(AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class LombokClass {

    @ToString.Include
    private String name;

    @EqualsAndHashCode.Include
    private int age;

}
