package com.tech.w01lamda4;

interface Bank {
	void save(int bunho, int money); // 추상메소드
}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save(1, 2000);
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
			System.out.println(a + "번 입금액 람다식 : " + b);
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법 2
		customer.deposit((a, b) -> {// 타입생략
			System.out.println(a + "번 입금액 람다식 : " + b);
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법 3		
		customer.deposit((a, b) -> {// 매개변수가 2개 이상이므로 가로 생략 불가
			System.out.println(a + "번 입금액 람다식 : " + b);
		});
		System.out.println("-----------------");

	}
}
