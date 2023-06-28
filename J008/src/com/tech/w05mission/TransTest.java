package com.tech.w05mission;

public class TransTest {
	public static void main(String[] args) {

		Trans[] trans = new Trans[4];
		trans[0] = new Train(10, 100, 500);
		trans[1] = new CityBus(10, 100, 100);
		trans[2] = new Express(2, 20, 1500);
		trans[3] = new Taxi(3, 100, 1000);

		System.out.println("===============");
		System.out.println("결과");
		for (int i = 0; i < trans.length; i++) {
			System.out.println("===============");
//			System.out.println("결과");
			transpay(trans, i);
		}

	}

	private static void transpay(Trans[] trans, int i) {
		System.out.println(trans[i]);
		System.out.println(trans[i].getCharge());
	}

}
// 출력값을 메소드 생성하고 for문으로 출력하기 
// 출력값을 배열이니까 i로 세팅하고 범위잡아 Refactor > method 생성한다.
// 생성된 메소드에 int i 값을 넣고 for문에 i값을 추가한다.