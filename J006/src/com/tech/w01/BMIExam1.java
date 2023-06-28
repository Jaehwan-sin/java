package com.tech.w01;

public class BMIExam1 {
	public static void main(String[] args) {
//		객체생성
		BMIExam1 m = new BMIExam1();
		float h = 1.76f;
		float w = 76.0f;
		float index = m.calculate(h, w);

		System.out.println("체질량지수 : " + index);

//		체질량 지수로 비만도 판정
		String message = m.getResult(index);
		System.out.println("판정 : " + message);
	}

	public float calculate(float h, float w) {
		// 계산식
		float hmulti = h * h;
		float index = w / hmulti;
		return index;
	}

	public String getResult(float index) {
		String msg;
		if (index >= 25) {
			msg = "비만";
		} else if (index >= 23) {
			msg = "과체중";
		} else if (index >= 18.5) {
			msg = "정상";
		} else {
			msg = "저체중";
		}
		return msg;
//		return ""; 리턴을 위에서 모든값에 대해 리턴을 줬기 때문에 중복 리턴이 되어 삭제해야한다.
	}
}
