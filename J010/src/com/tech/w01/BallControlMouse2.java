package com.tech.w01;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MousePanel2 extends JPanel implements MouseListener {
	BufferedImage img = null;
	int img_x = 150, img_y = 150;

	public MousePanel2() {// 생성자 호출
		try {
			img = ImageIO.read(new File("src/Ball.png"));
		} catch (IOException e) {
			System.out.println("no image");
//			e.printStackTrace();
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("release");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("press");
		
		System.out.println("x좌표 : "+e.getX());
		System.out.println("y좌표 : "+e.getY());
		img_x=e.getX();
		img_y=e.getY();
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exit");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("enter");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click");
	}
}

public class BallControlMouse2 extends JFrame {

	public BallControlMouse2() {
		setSize(300, 300);
		setTitle("BallControlMouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MousePanel2());// 클래스를 만들으라는 뜻

		setVisible(true);
	}

	public static void main(String[] args) {
		new BallControlMouse2();
	}
}
