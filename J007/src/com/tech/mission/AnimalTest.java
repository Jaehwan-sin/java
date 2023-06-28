package com.tech.mission;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {

//      1.객체생성 
//		2.공통분모 출력 (메인에서 출력해보기)
//		3.부모 클래스로부터 상속받고 메소드 생성 
//		4.메인에서 메소드 불러와 출력
//		변수는 객체생성, 각각 클래스의 메소드 변수
		
		Dog d = new Dog();
		Cat c = new Cat();
		Elephant e = new Elephant();

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("동물을 입력하세요 d:dog, c:cat, e:elephant");
			String s = sc.next();

			if (s.equals("-1")) {
				System.out.println("프로그램 종료");
				break;
			} else if (!(s.equals("d") || s.equals("c") || s.equals("e"))) {
				System.out.println("입력범위 초과");
				continue;
			}
			selectone(d, c, e, s);
		}

	}

	private static void selectone(Dog d, Cat c, Elephant e, String s) {
		switch (s) {
		case "d":
			d.Incommon();
			d.DogD();
			System.out.println();
			break;

		case "c":
			c.Incommon();
			c.CatC();
			System.out.println();
			break;

		case "e":
			e.Incommon();
			e.EleE();
			break;

		default:
			break;
		}
	}

}
