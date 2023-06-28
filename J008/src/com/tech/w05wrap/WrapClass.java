package com.tech.w05wrap;

public class WrapClass {
	public static void main(String[] args) {
//		랩퍼클래스

		String str = "10";
		String str2 = "10.5";
		String str3 = "true";

		byte b = Byte.parseByte(str);
		System.out.println("문자열 byte값 변환 : " + b);
		int i = Integer.parseInt(str); // ******
		System.out.println("문자열 Integer값 변환 : " + i);
		short s = Short.parseShort(str);
		System.out.println("문자열 short값 변환 : " + s);

		long l = Long.parseLong(str);
		System.out.println("문자열 Long값 변환 : " + l);

		float f = Float.parseFloat(str);
		System.out.println("문자열 float값 변환 : " + f);

		boolean bool = Boolean.parseBoolean(str);
		System.out.println("문자열 boolean값 변환 : " + b);
	}

}
