package com.tech.w02;

public class Television {
	
	public int channel; // private는 접근지정자, private는 이 클래스에서만 접근 가능하다.
	public int volumn;
	public boolean onOff;
	
	public static void main(String[] args) {
		int num = 0;
//		지역변수는 수동으로 초기화 해야한다.
		boolean bool;
		
		// 객체생성
		Television tv = new Television();
		System.out.println(tv.channel);
		System.out.println(tv.volumn);
		System.out.println(tv.onOff);
		
		tv.channel=1;
		tv.volumn=9;
		tv.onOff=true;
		
		System.out.println("tv channel : "+tv.channel);
		System.out.println("tv volumn : "+tv.volumn);
		
		if (tv.onOff) {
			System.out.println("tv Onnnnn");
		}else {
			System.out.println("tv Offfff");
		}
	}
}
