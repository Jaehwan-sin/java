package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent4 extends JFrame {

	private JButton button1, button2;
	private JLabel label;

	public ActionEvent4() {
		setTitle("event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");

//		버튼에 수신자 부착
		button1.addActionListener(new MyListener4());// MyListner2는 생성자 호출하는거다. 클래스를 만들어라.(내부 클래스도 가능)
		button2.addActionListener(new MyListener4());

//		판넬에 버튼,라벨 부착
		panel.add(button1);
		panel.add(button2);
		panel.add(label);

//		판넬을 프레임에 부착
//		this.add(panel); // this가 이 클래스를 지칭하기때문에 this를 쓰지만 생략이 가능하다.
		add(panel);

		setVisible(true);
	}

//		내부 클래스
	private class MyListener4 implements ActionListener {// ActionListener는 인터페이스이며 추상메소드의 집합이니까 여기서 구체적으로 표현해줘야한다.

		boolean flag = true;

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();

//			System.out.println("신호감지!" + e);
			if (button.getText() == "버튼1") {
				System.out.println("나는 버튼1");
				if (flag) {// 클릭을 하면 초기화면과 다음 화면이 계속 반복되게 작업
					label.setText("버튼1 ON");
					flag = false;
				} else {
					label.setText("버튼1 OFF");
					flag = true;
				}
			} else if (button.getText() == "버튼2") {
				System.out.println("나는 버튼2");
				if (flag) {// 클릭을 하면 초기화면과 다음 화면이 계속 반복되게 작업
					label.setText("버튼2 ON");
					flag = false;
				} else {
					label.setText("버튼2 OFF");
					flag = true;
				}
			}

		}
	}

	public static void main(String[] args) {

		new ActionEvent4();
	}
}
