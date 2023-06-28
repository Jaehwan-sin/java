package com.tech.w06;

public class PigSave {
	private int total;

	public void deposit(int amount) {
		System.out.println(amount + "금 저축");
		total += amount;// total에 누적

	}

	public int getTotal() { // 마우스 오른쪽 - source - getter and setter 들어가서 생성하면 자동 생성된다.
		return total;// 위에 처럼 private 이면 접근이 안되지만 public으로 메소드를 결과값만 호출하면 값이 불러와진다.

	}

}
