package com.tech.w06di03mission;

public class Tea {
	private koreanTea tea;

	public Tea(koreanTea tea) {
		this.tea = tea;

	}

	public void teaType() {
		System.out.println(tea.getName());
	}
}
