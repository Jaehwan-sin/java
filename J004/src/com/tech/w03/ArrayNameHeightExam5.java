package com.tech.w03;

import java.util.Scanner;

public class ArrayNameHeightExam5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("인원수를 입력: ");
		int cntPerson=scanner.nextInt(); //인원수에 맞게 입력을 받아온다.
//		변수의 명명규칙
//		꼭 지켜야 하는것들
//		- 하나 이상의 문자 (타입만 정의해선 안된다.)
//		- 첫번째 글자는 문자, _ , $ 가능 (1data)를 변수명으로는 안됨. 첫 글자가 숫자이기때문에
//		- 길이에 제한없음
//		- 자바의 키워드 사용불가 int public X
//		
//		권장사항
//		- 첫 글자를 소문자 명사로
//		- 의미를 담고 축약
//		
//		방법 합성어
//			student score
//			studentScore camel type
//			student_Score snake type
			
		String [] names= new String[cntPerson];
//	배열1 names에 이름 5인을 미리 입력하고
//		String [] names= {"tom1","tom2","tom3","tom4","tom5"};
		System.out.println(names[0]);// 입력할 숫자를 입력하기 위해 names[0]을 쓴다.

//	배열2 heights 각각 이름의 키를 입력받아
		int [] heights= new int[names.length];// new int[name.length]로 써도 된다.
//		신장 입력
		int total=0;
//		이름 키 동시입력
		for (int i = 0; i < heights.length; i++) {
			System.out.println("이름을 입력하시오 : ");
			names[i]=scanner.next();// 이름 입력
			System.out.println("키를 입력하시오 : ");
			heights[i]=scanner.nextInt();// heights 값 입력
			total+=heights[i]; // 누적 += : total을 heights[i]에 더하고 total 에 대입한다.
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
