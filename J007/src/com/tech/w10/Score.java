package com.tech.w10;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int math;

	public Score(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;

	}

	public String getName() {
		return name;
	}

	public float getTotal() {
		float Total = korean + english + math;
		return Total;
	}

	public float getAvg() {
		float Avg = (korean + english + math) / 3;
		return Avg;
	}

}
