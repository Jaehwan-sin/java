package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//	배열1 names에 이름 5인을 미리 입력하고
//		String [] names= {"tom1","tom2","tom3","tom4","tom5"};
		String [] names= new String[5];
		
		System.out.println(names[0]);
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하시오 : ");
			names[i]=scanner.next();// 입력하게 하는 명령 next():string 타입으로 진행해야함.
		}
		
//	배열2 heights 각각 이름의 키를 입력받아
		int [] heights= new int[names.length];// new int[name.length]로 써도 된다.
//		신장 입력
		int total=0;
		for (int i = 0; i < heights.length; i++) {
			System.out.println("키를 입력하시오 : ");
			heights[i]=scanner.nextInt();
			total+=heights[i]; // 누적
		}
		for (int i = 0; i < heights.length; i++) {
			System.out.println(names[i]+"의 키는 "+heights[i]);
		}

		
		System.out.println("키의 합계 : "+total);
		System.out.println("키의 평균 : "+total/(float)heights.length);
//	배열 1의 이름에 해당하는 키를 출력하시오.
		
//	신장토탈 신장평균 출력
		
			
	}
}
