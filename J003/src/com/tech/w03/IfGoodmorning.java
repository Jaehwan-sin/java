package com.tech.w03;

import java.util.Calendar;
import java.util.Date;

public class IfGoodmorning {
	public static void main(String[] args) {
		//객체생성
//		Date date=new Date();
//		int currHour=date.getHours();// 취소선의 의미는 이 메소드를 사용하지 마세요.
//		System.out.println(currHour);
		
		//if 12보다 작으면 Good mornig
		//12보다 크면 Good evening
				
//		if (currHour<12) {
//			System.out.println("Good morning");
//		} else {
//			System.out.println("Good evening");
//		}
				
		Calendar calendar=Calendar.getInstance();
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hour);
		if (hour>12) {
			System.out.println("Good evening");
		}else {
			System.out.println("Good morning");
		}
		
		
		
		
		
		
		
		
	}
}
