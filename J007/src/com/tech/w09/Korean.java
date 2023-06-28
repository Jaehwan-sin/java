package com.tech.w09;

public class Korean {
	private String nation = "대한민국";
	private String name;
	private String ssn;

	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;

	}

	public String getNation() {
		return nation;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

}
