package com.tech.w04;

public class SwitchExam3 {
	public static void main(String[] args) {

//		랜덤숫자가 1~6까지 범위숫자 추출
		int num = (int) (Math.random()*6)+1; 
		System.out.println(num);
		
//		주사위 놀이
		switch (num) {
		case 1:												//키 값의 경우의 수를 표현
			System.out.println(num+"입니다.");				//표현식
			break;
		case 2:												
			System.out.println(num+"입니다.");	
			break;
		case 3:												
			System.out.println(num+"입니다.");			
			break;
		case 4:											
			System.out.println(num+"입니다.");				
			break;
		case 5:												
			System.out.println(num+"입니다.");					
			break;

		default:	
			System.out.println(num+"입니다.");				//나머지를 의미 (if문에서 else)
			break;
		}
		
	}
}
