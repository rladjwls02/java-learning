package com.example.demo;

import com.example.demo.member.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		Member djwls = new Member(20020329, "김어진", 25);
		System.out.println(djwls.getId());
		System.out.println(djwls.getAge());
		System.out.println(djwls.getName());

	}
}
