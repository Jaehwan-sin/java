package com.tech.w01lamda;

interface Bank {
	void save(); // 추상메소드
}

class Customer {
	public void deposit(Bank saveMoney) {
		saveMoney.save();
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
//		람다식을 사용하지 않을 경우
		customer.deposit(new Bank() {

			@Override
			public void save() {
				System.out.println("1번 입금액 1000");

			}
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법
		customer.deposit(() -> {
			System.out.println("1번 입금액 1000 람다식");
		});
	}
}
