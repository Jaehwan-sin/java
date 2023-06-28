package com.tech.mission2;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {
//  1.객체생성 
//	2.공통분모 출력 (메인에서 출력해보기)
//	3.부모 클래스로부터 상속받고 메소드 생성 
//	4.메인에서 메소드 불러와 출력
//	변수는 객체생성, 각각 클래스의 메소드 변수
		
		Dog d = new Dog();
		d.Incommon();
		
		Cat c = new Cat();
		c.Incommon();
		c.CatC();
		
		Elephant e = new Elephant();

	}

}
