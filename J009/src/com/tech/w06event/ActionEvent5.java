package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent5 extends JFrame implements ActionListener {

	private JButton button1, button2;
	private JLabel label;

	public ActionEvent5() {
		setTitle("event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");

//		버튼에 수신자 부착
		button1.addActionListener(this);
		button2.addActionListener(this);

//		판넬에 버튼,라벨 부착
		panel.add(button1);
		panel.add(button2);
		panel.add(label);

//		판넬을 프레임에 부착
//		this.add(panel); // this가 이 클래스를 지칭하기때문에 this를 쓰지만 생략이 가능하다.
		add(panel);

		setVisible(true);
	}

//		내부 클래스, 내부 클래스를 만드는 이유는 ActionListener를 사용하기 위해서이다.
	private class MyListener5 implements ActionListener {// ActionListener는 인터페이스이며 추상메소드의 집합이니까 여기서 구체적으로 표현해줘야한다.

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

	public static void main(String[] args) {

		new ActionEvent5();
	}

	boolean flag1 = true;// actionperformed 외부에서 선언되어야한다.
	boolean flag2 = false;

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton button = (JButton) e.getSource();
		
		if (button.getText() == "버튼1") {
			System.out.println("나는 버튼1");
			if (flag1) {// 클릭을 하면 초기화면과 다음 화면이 계속 반복되게 작업
				label.setText("버튼1 ON");
				flag1 = false;
			} else {
				label.setText("버튼1 OFF");
				flag1 = true;
			}
		} else if (button.getText() == "버튼2") {
			System.out.println("나는 버튼2");
			if (flag2) {// 클릭을 하면 초기화면과 다음 화면이 계속 반복되게 작업
				label.setText("버튼2 ON");
				flag2 = false;
			} else {
				label.setText("버튼2 OFF");
				flag2 = true;
			}
		}

	}
}
