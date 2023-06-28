package com.tech.w01lamda5;

interface Bank {
	void save(int bunho, int money); // 추상메소드
}

interface Card {
	void save(String name, int money); // 추상메소드
}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save(1, 2000);
	}

	public void deposit(Card saveMoney) {
		saveMoney.save("hong", 2000);
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
//		람다식을 사용하지 않을 경우
		customer.deposit(new Bank() {
			@Override
			public void save(int bunho, int money) {
				System.out.println(bunho + "번 입금액 : " + money);
			}
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법
		customer.deposit((int a, int b) -> {
			System.out.println(a + "번 입금액 람다식 bank : " + b);
		});
		System.out.println("-----------------");

//		람다식을 사용한 표현방법 2
		customer.deposit((String a, int b) -> {// 인터페이스가 2개 이상이면 타입도 생략불가
			System.out.println(a + "번 입금액 람다식 card : " + b);
		});
		System.out.println("-----------------");

	}
}
