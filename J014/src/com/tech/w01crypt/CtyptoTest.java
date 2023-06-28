package com.tech.w01crypt;

public class CtyptoTest {
	public static void main(String[] args) throws Exception {
		String password = "123456";
		System.out.println("단방향 암호화");
		String key = CryptoUtil.sha512(password);
		System.out.println("sha512로 변환된 값 : "+key);
		
		System.out.println("양방향 암호화");
		String key2 = "1kjkjkjk$%!@#@#@#%ohhkkhkhk9999";
//		String encryStr = CryptoUtil.encryptAES256(password, key2);
		String encryStr = CryptoUtil.encryptAES256(password, key);// 알고리즘에 의해 변경된다.
		System.out.println("비밀번호 : "+password);
		System.out.println("비밀번호 2차 암호화 : "+encryStr);
		
//		복호화 처리
		System.out.println("복호화 처리");
		String decrypstr=CryptoUtil.decryptAES256(encryStr, key);
		System.out.println("복호화된 데이터 : "+decrypstr);
	}
}
