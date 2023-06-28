package com.tech.w01lamda3;

interface Bank {
	void save(int money); // 추상메소드
}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save(1000);
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
//		람다식을 사용하지 않을 경우
		customer.deposit(new Bank() {

			@Override
			public void save(int a) {
				System.out.println("1번 입금액 : " + a);
			}
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법
		customer.deposit((int a) -> {
			System.out.println("1번 입금액 람다식 : " + a);
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법 2
		customer.deposit((a) -> {// 타입생략가능
			System.out.println("1번 입금액 람다식 : " + a);
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법 3
		customer.deposit(a -> {// ()생략가능,???
			System.out.println("1번 입금액 람다식 : " + a);
		});

	}
}
