package com.tech.w06mission;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class myframe extends JFrame implements ActionListener {

	private ImageIcon[] imgs;
	private JButton gawi, bawi, bo;
	private JTextField uptext, downtext;
	private JPanel toppanel, downpanel;

	public myframe() {
		setTitle("GBB Game");
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		이미지 보관
		imgs = new ImageIcon[3];
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = new ImageIcon("src/" + i + ".png");
		}

//		이미지 출력
		gawi = new JButton(imgs[0]);
		bawi = new JButton(imgs[1]);
		bo = new JButton(imgs[2]);

//      텍스트 필드
		uptext = new JTextField();
		uptext.setColumns(80);

		downtext = new JTextField();
		downtext.setColumns(80);

//		버튼
		gawi.addActionListener(this);
		bawi.addActionListener(this);
		bo.addActionListener(this);

//      판넬
		toppanel = new JPanel();
		toppanel.add(uptext);

		downpanel = new JPanel();
		downpanel.add(downtext);

		JPanel panel = new JPanel(new GridLayout());
		JPanel btnpanel = new JPanel(new GridLayout(1, 3));
		btnpanel.add(gawi);
		btnpanel.add(bawi);
		btnpanel.add(bo);
		panel.add(btnpanel);

		add(toppanel, "North");
		add(panel, "Center");
		add(downpanel, "South");
//		panel.add(panel2);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user;
		String com;

		if (e.getSource() == gawi) {
			user="유저는 가위";
		} else if (e.getSource() == bawi) {
			user="유저는 바위";
		} else if (e.getSource() == bo) {
			user="유저는 보";
		}
		
	}
}

public class GBBGameSwing {
	public static void main(String[] args) {
		new myframe();
		// 출력 : 컴:가위, 유저:바위 / 유저 승
		// 가위 1, 바위 2, 보 3
		// 두 값을 입력받기 Scanner Random

		System.out.println("가위바위보 게임");
		System.out.println("1.주먹 2.가위 3.보자기");
		System.out.println("숫자를 입력하세요");
		int user;
		int com = (int) (Math.random() * 3) + 1;
		Scanner sc = new Scanner(System.in);
		user = sc.nextInt();

		System.out.println("유저 : " + user);

		if (user == 1) // 유저가 내는 경우의 수
			System.out.println("유저가 가위를 냈습니다.");
		else if (user == 2)
			System.out.println("유저가 바위를 냈습니다.");
		else if (user == 3)
			System.out.println("유저가 보자기를 냈습니다.");

		if (com == 1) // 컴퓨터가 내는 경우의 수
			System.out.println("컴퓨터가 가위를 냈습니다.");
		else if (com == 2)
			System.out.println("컴퓨터가 바위를 냈습니다.");
		else if (com == 3)
			System.out.println("컴퓨터가 보자기를 냈습니다.");

		// 승패 경우의 수
		if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2))
			System.out.println("유저 승!");
		else if ((com == 1 && user == 3) || (com == 2 && user == 1) || (com == 3 && user == 2))
			System.out.println("컴퓨터 승!");
		else if (user == com)
			System.out.println("무승부");

	}
}
