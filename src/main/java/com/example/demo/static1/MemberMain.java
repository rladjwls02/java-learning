package com.example.demo.static1;

public class MemberMain {
    static void main() {
        Member member = new Member(1, "Aaron", 10, "aaron@example.com");

        System.out.println(member);              // 객체 주소 (aaron 주소값 == baron 주소값)
        System.out.println(member.toString());   // 객체
        System.out.println(member.MEMBER_TO_STRING_FORMAT); // * 앞글자 소문자 : 물론 이렇게 호출할 수 있겠지만, 정상사용은 아님
        System.out.println(Member.MEMBER_TO_STRING_FORMAT); // * 앞글자 대문자 : Static 필드는 이렇게 호출하는것이 정상이다.
        System.out.println(member.toString(member));        // * 앞글자 소문자 : 물론 이렇게 호출할 수 있겠지만, 정상사용은 아님
        System.out.println(Member.toString(member));        // * 앞글자 대문자 : Static 메서드는 이렇게 호출하는것이 정상이다.
    }
}
