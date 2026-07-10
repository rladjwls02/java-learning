package com.example.demo.assignment;

public class MemberMain {
    public static void main(String[] args) {
        Member aaron = new Member(
                "911028-0000000",
                "Aaron",
                1
        );
        aaron.setName("Baron");
        System.out.println(aaron.toString());

        Member caron = new Member(
                "101010-0000000"
        );
        caron.setName("Caron");
        //caron.setAge(2);
        System.out.println(caron.toString());
    }
}
