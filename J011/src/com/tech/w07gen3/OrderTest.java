package com.tech.w07gen3;

class OrderVal<K, V> {

	private K key;
	private V value;

	public OrderVal(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class OrderTest {
//	제너릭 형태로 두 가지의 다른 타입 내용을 전달 후 출력
	public static void main(String[] args) {

		OrderVal<String, Integer> pi = new OrderVal<String, Integer>("mykey", 10000);
		OrderVal<String, String> ps = new OrderVal<String, String>("mykey", "10000원");

		System.out.println(pi.getKey() + " : " + pi.getValue());
		System.out.println(ps.getKey() + " : " + ps.getValue());
	}
}
