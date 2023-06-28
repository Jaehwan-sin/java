package com.tech.w12;

public class Hobby {
	private String name;
	private String a;
	private String b;
	private String c;

	public Hobby(String name, String a, String b, String c) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getC() {
		return c;
	}

	public String gethobby() {
		return a+","+b+","+c;
	}
}
