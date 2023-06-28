package com.tech.w07;

public class AClass {

	private int i = 1;
	int k = 2;// default int k = 2; 랑 같은 의미
	public int p = 3;
	protected int p3 = 4;// 다른 패키지에 있어도 상속허용을 하면 불러와진다.

	private void accessVal() {
		AClass mine = new AClass();
		System.out.println(mine.i);
	}
}
