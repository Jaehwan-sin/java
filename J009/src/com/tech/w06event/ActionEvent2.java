package com.tech.w06event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEvent2 extends JFrame {

	private JButton button;
	private JLabel label;

	public ActionEvent2() {
		setTitle("event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요!");
		label = new JLabel("아직도 버튼을 누르지 않았군요!");

//		버튼에 수신자 부착
		button.addActionListener(new MyListner2());// MyListner2는 생성자 호출하는거다. 클래스를 만들어라.(내부 클래스도 가능)

//		판넬에 버튼,라벨 부착
		panel.add(button);
		panel.add(label);

//		판넬을 프레임에 부착
//		this.add(panel); // this가 이 클래스를 지칭하기때문에 this를 쓰지만 생략이 가능하다.
		add(panel);

		setVisible(true);
	}

//		내부 클래스
	private class MyListner2 implements ActionListener {// ActionListener는 인터페이스이며 추상메소드의 집합이니까 여기서 구체적으로 표현해줘야한다.
		
		boolean flag=true;// if문에서 true 만 나오면 안되니까 변수로 따로 명령을 내린다.
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("신호감지!");
			
			if (flag) {// 클릭을 하면 초기화면과 다음 화면이 계속 반복되게 작업
				button.setText("드디어 클릭!");
				label.setText("버튼이 눌렸군요!");
				flag=false;
			} else {
				button.setText("버튼을 누르세요!");
				label.setText("아직도 버튼을 누르지 않았군요!");
				flag=true;
			}
			System.out.println("flag : "+flag);
		}
	}

	public static void main(String[] args) {

		new ActionEvent2();
	}
}
