package com.tech.w04;

public class BenzClass extends CarClass {// CarClass로 부터 상속받음.
//	벤츠에서만의 특별한 작업들
	public void doJoripBenz() {
		System.out.println("벤츠 바디 조립");
		System.out.println("벤츠 도어 조립");
		System.out.println("벤츠 시트 조립 -> 출고");
	}

}
