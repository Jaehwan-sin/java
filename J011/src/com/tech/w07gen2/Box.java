package com.tech.w07gen2;

public class Box <T> {// generic 기본형
//  generic은 여러가지의 타입을 모두 담을 수 있다.
//	데이터 형식에 의존하지 않고, 
//	하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
