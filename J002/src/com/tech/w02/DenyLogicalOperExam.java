package com.tech.w02;

public class DenyLogicalOperExam {
	public static void main(String[] args) {
		//boolean, not함수 이해	
	boolean play1=false;
	boolean play2=false;
	System.out.println(play1);
		
	
//	역함수 not
	play1=!play1;//play는 true / !는 반대의 의미
	
	System.out.println(play1);
	
	boolean result1=play1 || play2;// ||는 or의 의미, or은 하나라도 true라면 true, 모두 false일때만 false
	System.out.println(result1);
	boolean result2=play1 && play2; //&&는 and의 의미, and는 입력값이 모두 true 일때만 true
	System.out.println(result2);
	
	play1=!play1;//play는 true / !는 반대의 의미
	
	System.out.println(play1);
	
	}
	
}
