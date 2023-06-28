package com.tech.w04inter3;

public class PhoneCall extends Phone implements VisualCall, VoiceCall {

	@Override
	public void sendVoiceMsg() {
		System.out.println("음성메시지 전달");
		
	}

	@Override
	public void getVoiceMsg() {
		System.out.println("음성메시지 수신");
		
	}

	@Override
	public void sendVisualMsg() {
		System.out.println("영상메시지 전달");
		
	}

	@Override
	public void getVisualMsg() {
		System.out.println("영상메시지 수신");
		
	}

}
