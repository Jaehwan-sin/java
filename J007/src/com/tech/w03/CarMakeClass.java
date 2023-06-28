package com.tech.w03;

import java.util.Scanner;

public class CarMakeClass {
	public static void main(String[] args) {

//		숫자를 입력받아 1(Benz),2(Sonata),3(Equus) 생산
//		Switch case 활용
		BenzClass bc = new BenzClass();
		EquusClass ec = new EquusClass();
		SonataClass sc = new SonataClass();

		Scanner a = new Scanner(System.in);
		System.out.println("생산라인을 입력하세요 (1)Benz,(2)Sonata,(3)Equus");
		int i = a.nextInt();

		switch (i) {
		case 1:
			bc.carBase();
			bc.doJoripBenz();
			break;
		case 2:
			sc.carBase();
			sc.doJoripSonata();
			break;
		case 3:
			ec.carBase();
			ec.doJoripEquus();
			break;
		default:
			System.out.println("생산라인 없음");
			break;
		}

	}
}
