package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    @ToString.Include(name = "memberId")
    @EqualsAndHashCode.Include
    /* private */ Integer id;
    @ToString.Include(rank = -1)
    @EqualsAndHashCode.Include
    /* private */ String name;
    /* private */ int age;
    /* private */ String email;
}

//  public boolean equals(Member member) {
//      return this.hashCode() == member.hashCode();
