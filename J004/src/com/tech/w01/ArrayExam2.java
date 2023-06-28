package com.tech.w01;

import java.util.Scanner;

public class ArrayExam2 {
	public static void main(String[] args) {
						
//		배열선언 
		int[] arr=new int[5]; // 배열선언 하는 방법 scores는 복수의 개념 int scores[]도 가능. 
//		Index number 0부터시작 중요하다! 꼭 외워놓기!
		
//		초기화없이 출력 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		System.out.println(arr[5]); // Error : Index 5 out of bounds
		
//		데이터대입 
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
//		반복문을 활용한 출력 
		for (int i = 0; i < arr.length; i++) { // length는 위의 new int[] 괄호 안의 숫자를 의미 
			System.out.println(arr[i]);
			
		}
			System.out.println("배열의 길이 : "+arr.length);
			
//			Scanner를 활용한 데이터 입력 
			Scanner scan=new Scanner(System.in);
			System.out.println("숫자 1번째 입력하세요");
			arr[0]=scan.nextInt();
			System.out.println("숫자 2번째 입력하세요");
			arr[1]=scan.nextInt();
			System.out.println("숫자 3번째 입력하세요");
			arr[2]=scan.nextInt();
			System.out.println("숫자 4번째 입력하세요");
			arr[3]=scan.nextInt();
			System.out.println("숫자 5번째 입력하세요");
			arr[4]=scan.nextInt();
			
//			반복문을 활용한 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.println("당신이 입력한 "+(i+1)+"번째 숫자는 :"+arr[i]);
			}
			
			
		}
}
