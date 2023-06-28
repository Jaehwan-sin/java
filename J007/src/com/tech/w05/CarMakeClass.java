package com.tech.w05;

import java.util.Scanner;

public class CarMakeClass {
	public static void main(String[] args) {

//		숫자를 입력받아 1(Benz),2(Sonata),3(Equus) 생산
//		Switch case 활용
		BenzClass bc = new BenzClass();
		EquusClass ec = new EquusClass();
		SonataClass sc = new SonataClass();
//		무한루프 무한대생산
//		-1 종료, 1~3 이외의 값은 입력범위초과 계속 생산
//		특정부분 메소드 추출
		while (true) {
			Scanner a = new Scanner(System.in);
			System.out.println("생산라인을 입력하세요 (1)Benz,(2)Sonata,(3)Equus");
			int i = a.nextInt();

			if (i == -1) {
				System.out.println("프로그램 종료");
				break;
			} else if (!(i >= 1 && i <= 3)) {
				System.out.println("입력범위 초과");
				continue;

			}
			selectone(bc, ec, sc, i);

		}

	}

	private static void selectone(BenzClass bc, EquusClass ec, SonataClass sc, int i) {
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
//		while (i==1 || i==2 || i==3) {
//			bc.carBase();
//			bc.doJoripBenz();
//			sc.carBase();
//			sc.doJoripSonata();
//			ec.carBase();
//			ec.doJoripEquus();
//		} if (i==-1) {
//			System.out.println("프로그램 종료");
//		} else {
//			System.out.println("입력범위 초과");
