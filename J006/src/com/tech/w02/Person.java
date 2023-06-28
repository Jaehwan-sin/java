package com.tech.w02;

public class Person {
	
	String name;// String의 초기값은 null
	int age;
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name="홍길동";
		person.laugh();
		person.name="BTS";
		person.laugh();
		
//		외부파일 접근 
		Television tvp = new Television();
		tvp.onOff = true;
		System.out.println(tvp.onOff);
		
//		===============
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volumn = 9;
		myTv.onOff = true;
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volumn = 12;
		yourTv.onOff = true;
	}
	
	public void laugh () {
		System.out.println(name+"가 깔깔 웃다");
	}
	
	
}
