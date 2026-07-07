package com.example.demo;

import java.util.Scanner;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		//업,다운 캐스팅 하기

		//업캐스팅 진행
		int a = 10;
		double b = a;
		System.out.println("형변환 명시없이 업캐스팅" + b);

		//다운 캐스팅
		b += 0.4;
		System.out.println("b의 원본 값" + b);
		int c = (int) b;
		System.out.println("변수명 앞에 반드시 형변환 명시해서 다운캐스팅 " + c);

		//기존에 쓰던 switch문 (나도 이렇게 썼음)
		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 5사이의 정수값을 입력하시오: ");
		int input = scanner.nextInt();
		switch (input) {
			case 1:
				System.out.println("입력값: 1");
				break;
			case 2:
				System.out.println("입력값: 2");
				break;

			default:
				System.out.println("지정범위 벗어남");
		}
		//new switch
		System.out.println("0~5사이의 값을 입력하시오");
		int num = scanner.nextInt();
		String cal = switch (num) {
			case 0, 2, 4 -> "짝수";
			case 1, 3, 5 -> "홀수";
			default -> "유효값이 아님";

		};
		System.out.println(cal);
	}
}
