package com.tech.w04inter3;

public class PhoneTest {
	public static void main(String[] args) {
		VoiceCall vocall = new PhoneCall();
		VisualCall vicall = new PhoneCall();

		vocall.sendVoiceMsg();
		vocall.getVoiceMsg();

		vicall.sendVisualMsg();
		vicall.getVisualMsg();

	}
}
