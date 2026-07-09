package com.example.demo.assignment;

public class MemberMain {
    public static void main(String[] args) {
        MemberRefactor aaron = new MemberRefactor(
                "911028-0000000",
                "Aaron",
                1
        );
        aaron.setName("Baron");
        System.out.println(aaron.toString());

        MemberRefactor caron = new MemberRefactor(
                "101010-0000000"
        );
        caron.setName("Caron");
        caron.setAge(2);
    }
}
