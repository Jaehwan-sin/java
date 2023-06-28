package com.tech.w08;
// 사용자 생성자를 생성해도 기본 생성자를 사용하지 않으면 기본 생성자는 생략 가능하다.
public class ConstructClass {
//	생성자 이해, 생성자 = Constructor
	// 기본 생성자, 디폴트 생성자, 생략가능
	public ConstructClass() {// 생성자, 생성자는 클래스의 이름 그대로이고 리턴타입이 빠져있다.
		// 사용자 생성자가 사용되면 기본 생성자도 생략 불가능
		System.out.println("나는 생성자 호출");
		// 생성자는 보통 초기작업구성 할 때 쓰인다.
	}

	public ConstructClass(String name) { // 사용자 생성자
		System.out.println(name + " 일어났슈?");
	}

	public ConstructClass(String name, float score) { // 사용자 생성자
		System.out.println(name + "의 점수는 " + score);
	}

	public ConstructClass(String string, int i, int j) {
		System.out.println(string+i+j);
	}

	// 일반 메소드
	public void aaa() { // 메소드는 일반적으로 소문자로 시작한다.(관습적으로)

	}

	public static void main(String[] args) {
		new ConstructClass();// 생성자 호출
		new ConstructClass("홍길동");// 사용자 생성자 호출
		new ConstructClass("홍길동", 100f);// 사용자 생성자 호출
		new ConstructClass("홍길동", 100,100);// 사용자 생성자 호출
	}
}
