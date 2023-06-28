package com.tech.w02mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class myFrame3 extends JFrame implements ActionListener {

	private JButton order_button, cancel_button;
	private JPanel down_panel;
	private JTextField text;

//	각각 판넬 클래스
	Welcomepanel3 welcomepanel = new Welcomepanel3();
	Typepanel3 typepanel = new Typepanel3();
	Sidepanel3 sidepanel = new Sidepanel3();
	Sizepanel3 sizepanel = new Sizepanel3();

	public myFrame3() {
		setTitle("Coffee Order");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		order_button = new JButton("주문");
		cancel_button = new JButton("취소");

		order_button.addActionListener(this);
		cancel_button.addActionListener(this);

		text = new JTextField();
		text.setEditable(false);
		text.setColumns(25);

		down_panel = new JPanel();
		down_panel.add(order_button);
		down_panel.add(cancel_button);
		down_panel.add(text);

//		타입 판넬, 사이드 판넬, 사이즈 판넬을 부착할 판넬 생성
		JPanel centerJPanel = new JPanel(new GridLayout(0, 3));
		centerJPanel.add(typepanel);
		centerJPanel.add(sidepanel);
		centerJPanel.add(sizepanel);

		add(welcomepanel, "North");
		add(centerJPanel, "Center");
		add(down_panel, "South");
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("주문신호");

		int kindprice = 0;
		int sideprice = 0;

		if (e.getSource() == order_button) {
			if (typepanel.typeStr == "hot") {
				switch (sizepanel.SizeStr) {
				case "Small":
					kindprice = 4000;
					break;
				case "Medium":
					kindprice = 4500;
					break;
				case "Large":
					kindprice = 5000;
					break;
				default:
					break;
				}
			} else if (typepanel.typeStr == "ice") {
				switch (sizepanel.SizeStr) {
				case "Small":
					kindprice = 4000;
					break;
				case "Medium":
					kindprice = 4500;
					break;
				case "Large":
					kindprice = 5000;
					break;
				default:
					break;
				}
			}
			switch (sidepanel.sideStr) {
			case "cookie":
				sideprice = 3000;
				break;
			case "banana":
				sideprice = 3000;
				break;
			case "sandwich":
				sideprice = 3000;
				break;
			case "chocolate":
				sideprice = 3000;
				break;
			default:
				break;
			}
			text.setText("price : " + (kindprice + sideprice));
		} else if (e.getSource() == cancel_button) {
			kindprice = 0;
			sideprice = 0;
			typepanel.typeStr = "";
			sidepanel.sideStr = "";
			sizepanel.SizeStr = "";
			typepanel.bg.clearSelection();
			sidepanel.bg.clearSelection();
			sizepanel.bg.clearSelection();

			text.setText("");
		}

	}
}

class Welcomepanel3 extends JPanel {

	private JLabel message;

	public Welcomepanel3() {
		message = new JLabel("별다방에 오신걸 환영합니다.");
		add(message);
	}
}

class Typepanel3 extends JPanel implements ActionListener {

	protected JRadioButton hot, ice;
	protected ButtonGroup bg;
	protected String typeStr = "";

	public Typepanel3() {
		setLayout(new GridLayout(2, 1));
		hot = new JRadioButton("hot");
		ice = new JRadioButton("ice");

		hot.addActionListener(this);
		ice.addActionListener(this);

//		버튼 그룹 설정
		bg = new ButtonGroup();
		bg.add(hot);
		bg.add(ice);
		this.setBorder(BorderFactory.createTitledBorder("Type"));

		add(hot);
		add(ice);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hot) {
			typeStr = "hot";
		} else if (e.getSource() == ice) {
			typeStr = "ice";
		}
		System.out.println("타입 : " + typeStr);
	}

}

class Sidepanel3 extends JPanel implements ActionListener {

	protected JCheckBox cookie, banana, sandwich, chocolate;
	protected ButtonGroup bg;
	protected String sideStr = "";

	public Sidepanel3() {
		setLayout(new GridLayout(4, 1));
		cookie = new JCheckBox("cookie");
		banana = new JCheckBox("banana");
		sandwich = new JCheckBox("sandwich");
		chocolate = new JCheckBox("chocolate");

		cookie.addActionListener(this);
		banana.addActionListener(this);
		sandwich.addActionListener(this);
		chocolate.addActionListener(this);

		bg = new ButtonGroup();
		bg.add(cookie);
		bg.add(banana);
		bg.add(sandwich);
		bg.add(chocolate);
		this.setBorder(BorderFactory.createTitledBorder("Side"));

		add(cookie);
		add(banana);
		add(sandwich);
		add(chocolate);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cookie) {
			sideStr = "cookie";
		} else if (e.getSource() == banana) {
			sideStr = "banana";
		} else if (e.getSource() == sandwich) {
			sideStr = "sandwich";
		} else if (e.getSource() == chocolate) {
			sideStr = "chocolate";
		}
		System.out.println("사이드 : " + sideStr);
	}

}

class Sizepanel3 extends JPanel implements ActionListener {

	protected JRadioButton Small, Medium, Large;
	protected ButtonGroup bg;
	protected String SizeStr = "";

	public Sizepanel3() {
		setLayout(new GridLayout(3, 1));
		Small = new JRadioButton("Small");
		Medium = new JRadioButton("Medium");
		Large = new JRadioButton("Large");

		Small.addActionListener(this);
		Medium.addActionListener(this);
		Large.addActionListener(this);

		bg = new ButtonGroup();
		bg.add(Small);
		bg.add(Medium);
		bg.add(Large);
		this.setBorder(BorderFactory.createTitledBorder("Size"));

		add(Small);
		add(Medium);
		add(Large);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Small) {
			SizeStr = "Small";
		} else if (e.getSource() == Medium) {
			SizeStr = "Medium";
		} else if (e.getSource() == Large) {
			SizeStr = "Large";
		}
		System.out.println("사이즈 : " + SizeStr);

	}

}

public class CoffeeOrder {

	public static void main(String[] args) {
		new myFrame3();
	}
}
