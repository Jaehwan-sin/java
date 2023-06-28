package com.tech.Mission2;

public class MatrixSum {

	int[][] arr = new int[5][5];

	public int[] matPrintSum() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;
				if (j == 4) {
					arr[i][4] = arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
				} else if (i == 4) {
					arr[4][j] = arr[0][j] + arr[1][j] + arr[2][j] + arr[3][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		return null;

	}

}
