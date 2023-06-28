package com.tech.w01;

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

// 피자 주문창 버튼 클릭 후 과정 처리
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

class welcomePanel2 extends JPanel {// 두번째 내부클래스 (판넬만 있는 클래스)
	private JLabel message;

	public welcomePanel2() {
		message = new JLabel("피자샵에 오신 걸 환영합니다!");
		this.add(message); // this 빼도 된다. / 판넬에 라벨 부착
	}
}

class TypePanel2 extends JPanel implements ActionListener {

	protected JRadioButton combo, potato, bulgogi;
	protected ButtonGroup bg;
	protected String typeStr = "";

	public TypePanel2() {
		setLayout(new GridLayout(3, 1));
		combo = new JRadioButton("콤보");
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
//		수신자 부착
		combo.addActionListener(this);
		potato.addActionListener(this);
		bulgogi.addActionListener(this);

//		border group 설정, 그룹에 넣으면 중복선택이 불가능하다.
		bg = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		this.setBorder(BorderFactory.createTitledBorder("Type"));// 타입을 감싸는 Type레이아웃

		add(combo);
		add(potato);
		add(bulgogi);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == combo) {
			typeStr = "combo";
		} else if (e.getSource() == potato) {
			typeStr = "potato";
		} else if (e.getSource() == bulgogi) {
			typeStr = "bulgogi";
		}
		System.out.println("타입 : " + typeStr);
	}

}

class ToppingPanel2 extends JPanel implements ActionListener {

	protected JCheckBox pepper, cheese, peperoni, bacon;
	protected ButtonGroup bg;
	protected String topStr = "";

	public ToppingPanel2() {
//		판넬 화면 구성하기
		setLayout(new GridLayout(4, 1));
		pepper = new JCheckBox("피망");
		cheese = new JCheckBox("치즈");
		peperoni = new JCheckBox("페퍼로니");
		bacon = new JCheckBox("베이컨");

//		각자 수신자 부착
		pepper.addActionListener(this);
		cheese.addActionListener(this);
		peperoni.addActionListener(this);
		bacon.addActionListener(this);

		bg = new ButtonGroup();
		bg.add(pepper);
		bg.add(cheese);
		bg.add(peperoni);
		bg.add(bacon);
		this.setBorder(BorderFactory.createTitledBorder("Topping"));

		add(pepper);
		add(cheese);
		add(peperoni);
		add(bacon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pepper) {
			topStr = "pepper";
		} else if (e.getSource() == cheese) {
			topStr = "cheese";
		} else if (e.getSource() == peperoni) {
			topStr = "peperoni";
		} else if (e.getSource() == bacon) {
			topStr = "bacon";
		}
		System.out.println("토핑 : " + topStr);
	}

}

class SizePanel2 extends JPanel implements ActionListener {

	protected JRadioButton Small, Medium, Large;
	protected ButtonGroup bg;
	protected String SizeStr = "";

	public SizePanel2() {
//		판넬 화면 구성하기
		setLayout(new GridLayout(3, 1));
		Small = new JRadioButton("스몰");
		Medium = new JRadioButton("미디움");
		Large = new JRadioButton("라지");

//		각자 수신자 부착
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

public class PizzaOrderExam2 {

	public static void main(String[] args) {
		new myFrame2();// JFrame이 있는 내부클래스를 따로 만들어준다.
	}
}
