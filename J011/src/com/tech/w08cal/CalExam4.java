package com.tech.w08cal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalExam4 extends JFrame implements ActionListener {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { "Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };

	public static void main(String[] args) {
		new CalExam4();
	}

	public CalExam4() {
		setTitle("계산기");
		setSize(600, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());// 동서남북으로 설정가능한 레이아웃

		tField = new JTextField(45);
		tField.setText("0.");
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 5, 3, 3));// 행 열 간격 조절

		buttons = new JButton[25];

		int index = 0;
//		반복문으로 버튼생성

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				buttons[index] = new JButton(labels[index]);// 버튼생성
				buttons[index].addActionListener(this);// 버튼 수신자 부착

				if (col >= 3) {// 글자색상변경
					buttons[index].setForeground(Color.red);
				} else {
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.cyan);

				panel.add(buttons[index]);// 판넬에 추가
				index++;
			}
		}
//		add(panel);
		add(tField, "North");
		add(panel, "Center");

		setVisible(true);
	}

	private double result = 0;// 결과값에 대한 변수
	private String Operator = "=";
	private boolean startNumber = true;// 기존의 숫자에 숫자를 더할 것인지?

	@Override
	public void actionPerformed(ActionEvent e) {
//		String alpha = "abcdef";
//		System.out.println(alpha.charAt(0));// alpha.charAt(0) = index number 0번째인 값을 출력해라.
		String command = e.getActionCommand();

		if (command.charAt(0) == 'C') {// Clear를 의미한다.
			startNumber = true;
			result = 0;
			Operator = "=";
			tField.setText("0.0");
		} else if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {// 숫자구분
//			숫자가 시작 숫자인지 두번째 숫자인지
			if (startNumber == true) {
				tField.setText(command);
			} else {
				tField.setText(tField.getText() + command);// 기존 숫자에 클릭숫자 부착
			}
			startNumber = false;
		} else {
			if (startNumber == true) {// 숫자의 시작시점
				if (command.equals("-")) {
					tField.setText(command);
				} else {
					Operator = command;// 연산기호
				}
			} else {// 계산처리
				Double x = Double.parseDouble(tField.getText());// double 값으로 변환
				calculate(x);// 실제 계산
				Operator = command;
				startNumber = true;
			}
		}

	}

	private void calculate(Double x) {// 사칙연산 처리
		if (Operator.equals("+")) {
			result = result + x;
		} else if (Operator.equals("-")) {
			result = result - x;
		} else if (Operator.equals("x")) {
			result = result * x;
		} else if (Operator.equals("/")) {
			result = result / x;
		} else if (Operator.equals("=")) {
			result = x;
		}
		tField.setText(result + "");// text가 들어가야하는데 result가 숫자이기때문에 +""으로 문자열로 보이게한다.
	}
}
