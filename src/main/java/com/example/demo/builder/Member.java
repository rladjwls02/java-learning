package com.example.demo.builder;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.logging.Level;

@Getter@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = false)
@NoArgsConstructor

public class Member {
    String name;
    String email;

}
