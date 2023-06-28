package com.tech.w02;

public class TwoDemonArray {
	public static void main(String[] args) {
//		이차원 배열 선언
		int[][] arr=new int[4][3]; //[4]는 행. [3]은 렬 행렬의 갯수
//		이차원 배열 길이
		System.out.println(arr.length); // 행의 길이가 이차원 배열의 length이다.
//		arr[0].length;
		System.out.println(arr[0].length); // 1차원 배열의 길이
		//데이터 대입
		arr[0][0]=10;arr[0][1]=20;arr[0][2]=30;
		arr[1][0]=40;arr[1][1]=50;arr[1][2]=60;
		arr[2][0]=70;arr[2][1]=80;arr[2][2]=90;
		arr[3][0]=100;arr[3][1]=110;arr[3][2]=120;
//		위 내용 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t ");// print 랑 \t는 2차정렬의 행렬 형태로 출력해준다.
			}
			System.out.println();
		}
		
	}
}
