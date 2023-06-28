package com.tech.w02;

public class Car {
	// 이 영역이 필드 라고한다. 상태를 필드로 뽑아낸다.
	String color;// 사람이 따로 초기화 시키지 않아도 자바 프로그램에서 초기화해준다.
	int speed;
	boolean power=true;
	
	public static void main(String[] args) {
		Car c = new Car(); // 객체생성
		c.runCar();
	}
	
	public void runCar () {
		System.out.println("color : "+color);
		System.out.println("speed : "+speed);
		System.out.println("power : "+power);
		
	}
	
	public void stopCar () {
		
		
	}
	
}
