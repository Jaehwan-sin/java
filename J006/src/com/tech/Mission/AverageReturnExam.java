package com.tech.Mission;

public class AverageReturnExam {
    public static int intAvg(int num1, float num2, int num3, float num4) {
    	float sum = num1 + num2 + num3 + num4;
        int avg = Math.round(sum) / 4; // math.round는 가까운 인수로 반올림시킨다.
        return avg;
    }

    public static void main(String[] args) {
        int result = intAvg(100, 100.7f, 150, 500.5f);
        System.out.println("평균은 : " + result);
    }
}
