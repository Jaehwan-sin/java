package com.tech.w06di03mission;

public class TeaTest {
	public static void main(String[] args) {

		Tea tea = new Tea(new GreenTea());
		tea.teaType();
		
		Tea tea2 = new Tea(new BlackTea());
		tea2.teaType();
		
		Tea tea3 = new Tea(new YuzaTea());
		tea3.teaType();

	}

}
