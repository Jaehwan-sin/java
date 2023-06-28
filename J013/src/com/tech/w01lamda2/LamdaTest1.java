package com.tech.w01lamda2;

interface Bank {
	int save(); // 추상메소드
}

class Customer {
	public void deposit(Bank saveMoney) {
		int rMoney = saveMoney.save();
		System.out.println("Money : " + rMoney);
	}
}

public class LamdaTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
//		람다식을 사용하지 않을 경우
		customer.deposit(new Bank() {

			@Override
			public int save() {
				System.out.println("1번 입금액 1000");
				return 1000;
			}
		});
		System.out.println("-----------------");
//		람다식을 사용한 표현방법
		customer.deposit(() -> {
			System.out.println("1번 입금액 1000 람다식");
			return 2000;
		});
	}
}
