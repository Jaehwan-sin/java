package com.tech.w02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class myFrame2 extends JFrame implements ActionListener { // 내부 클래스 (프레임만 있는 클래스)

	private JButton order_button, cancel_button;
	private JPanel down_panel;
	private JTextField text;

	// 각각 판넬 클래스
	welcomePanel2 welcomePanel = new welcomePanel2();// welcomePanel의 내부 클래스를 만들어라.
	TypePanel2 typePanel = new TypePanel2();// TypePanel의 내부 클래스를 만들어라.
	ToppingPanel2 toppingPanel = new ToppingPanel2();// ToppingPanel의 내부 클래스를 만들어라.
	SizePanel2 sizePanel = new SizePanel2();// SizePanel의 내부 클래스를 만들어라.

	public myFrame2() {
		setTitle("pizza Order");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		결과 출력
		order_button = new JButton("주문");
		cancel_button = new JButton("취소");
//		수신자 부착
		order_button.addActionListener(this);
		cancel_button.addActionListener(this);

		text = new JTextField();
		text.setEditable(false);// 입력불가 (결과문만 출력하게 하겠다)
		text.setColumns(25);// 입력창 길이

		down_panel = new JPanel();
		down_panel.add(order_button);
		down_panel.add(cancel_button);
		down_panel.add(text);

//		타입 판넬, 토핑 판넬, 사이즈 판넬을 부착할 판넬 생성
		JPanel centerJpanel = new JPanel(new GridLayout(0, 3));
		centerJpanel.add(typePanel);
		centerJpanel.add(toppingPanel);
		centerJpanel.add(sizePanel);

//		웰컴 판넬 부착
		add(welcomePanel, "North");
		add(centerJpanel, "Center");
		add(down_panel, "South");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("주문 신호");

		int kindPrice = 0;
		int topPrice = 0;

		if (e.getSource() == order_button) {
			if (typePanel.typeStr == "combo") {
				switch (sizePanel.SizeStr) {
				case "Small":
					kindPrice = 10000;
					break;
				case "Medium":
					kindPrice = 15000;
					break;
				case "Large":
					kindPrice = 20000;
					break;
				default:
					break;
				}
			} else if (typePanel.typeStr == "potato") {
				switch (sizePanel.SizeStr) {
				case "Small":
					kindPrice = 11000;
					break;
				case "Medium":
					kindPrice = 16000;
					break;
				case "Large":
					kindPrice = 21000;
					break;
				default:
					break;
				}
			} else if (typePanel.typeStr == "bulgogi") {
				switch (sizePanel.SizeStr) {
				case "Small":
					kindPrice = 12000;
					break;
				case "Medium":
					kindPrice = 17000;
					break;
				case "Large":
					kindPrice = 22000;
					break;
				default:
					break;
				}
			}
			switch (toppingPanel.topStr) {
			case "pepper":
				topPrice = 1000;
				break;
			case "cheese":
				topPrice = 2000;
				break;
			case "peperoni":
				topPrice = 3000;
				break;
			case "bacon":
				topPrice = 4000;
				break;
			default:
				break;
			}
			text.setText("price : " + (kindPrice + topPrice));
		} else if (e.getSource() == cancel_button) {
			kindPrice = 0;
			topPrice = 0;
			typePanel.typeStr = "";
			toppingPanel.topStr = "";
			sizePanel.SizeStr = "";
			typePanel.bg.clearSelection();
			toppingPanel.bg.clearSelection();
			sizePanel.bg.clearSelection();

			text.setText("");
		}
	}
}