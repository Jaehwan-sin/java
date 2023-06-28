package com.tech.w02;

import javax.swing.JLabel;
import javax.swing.JPanel;

class welcomePanel2 extends JPanel {// 두번째 내부클래스 (판넬만 있는 클래스)
	private JLabel message;

	public welcomePanel2() {
		message = new JLabel("피자샵에 오신 걸 환영합니다!");
		this.add(message); // this 빼도 된다. / 판넬에 라벨 부착
	}
}