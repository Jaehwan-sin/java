package com.tech.w01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel { // 클래스 생성

	BufferedImage img = null; // 이미지를 임시로 저장해놓는곳
	int img_x = 100, img_y = 100; // 좌표 값

	public MyPanel() { // 생성자 생성, 화면 구성
		try {// try catch는 예외처리이다.
			img = ImageIO.read(new File("src/Ball.png"));// 이미지 가져오기, IO = Input, Output
		} catch (IOException e) {
			System.out.println("no image");
		}
//		키보드 리스너 추가
		addKeyListener(new KeyListener() {// 추상메소드, 키 입력신호를 전달 할 때엔 keyListener를 써야한다. ActionListener는 안됨.

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override // 키에서 뗄 때
			public void keyReleased(KeyEvent e) {

			}

			@Override // 키를 누를때
			public void keyPressed(KeyEvent e) {
				System.out.println("Key Press");
				int keycode = e.getKeyCode();
//				System.out.println(keycode);
				switch (keycode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				default:
					break;
				}
//				공을 보이게 하는 과정
				repaint(); // 화면에 다시 그리기
			}
		});
		this.requestFocus();
		setFocusable(true);
	}
	@Override//		공을 보이게 하는 과정
		protected void paintComponent(Graphics g) {
//			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, img_x, img_y, null);
			
		}
}

public class BallControllkeyBoard extends JFrame {

	public BallControllkeyBoard() {// 생성자
		setTitle("Ball Control");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		판넬을 프레임에 추가
		add(new MyPanel());

		setVisible(true);
	}

	public static void main(String[] args) {
		new BallControllkeyBoard(); // 생성자 호출
	}
}
