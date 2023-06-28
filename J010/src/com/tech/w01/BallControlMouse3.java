package com.tech.w01;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MousePanel3 extends JPanel {
	BufferedImage img = null;
	int img_x = 150, img_y = 150;

	public MousePanel3() {// 생성자 호출
		try {
			img = ImageIO.read(new File("src/bullet.png"));
		} catch (IOException e) {
			System.out.println("no image");
//			e.printStackTrace();
		}
		addMouseListener(new MouseAdapter() {
//			MouseAdapter, MouserMotionAdapter, keyAdapter, focusAdapter, windowAdapter
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("press");

				System.out.println("x좌표 : " + e.getX());
				System.out.println("y좌표 : " + e.getY());
				img_x = e.getX();
				img_y = e.getY();
				repaint();
				super.mousePressed(e);
			}

		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class BallControlMouse3 extends JFrame {

	public BallControlMouse3() {
		setSize(300, 300);
		setTitle("BallControlMouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MousePanel3());// 클래스를 만들으라는 뜻

		setVisible(true);
	}

	public static void main(String[] args) {
		new BallControlMouse3();
	}
}
