package com.tech.w05;

public class Salary {
	public int getSalary (int gibon, int sudan) {
		
		int tax = gibon/10;
		int X = gibon+sudan-tax;
		
		return X;
	}
}
