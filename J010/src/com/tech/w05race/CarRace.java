package com.tech.w05race;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class RaceThreadx extends Thread {
	RaceFrame frame;
	int x, y, w, h;

	public RaceThreadx(RaceFrame frame, int x, int y, int w, int h) {
		this.frame = frame;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	@Override
	public void run() {
		System.out.println("쓰레드 동작");
//		랜덤값을 얻어서 sleep시간으로 지정, x값은 endline까지 증가
		Random r = new Random();
		Dimension d = frame.getSize();
		int widthLast = (int) (d.getWidth() - (2 * x)) + 30;
		System.out.println("width : " + widthLast);
//		좌표값을 바꿔주는 쓰레드 동작
		for (; x < widthLast; x += 10) {
			frame.repaint();
			try {
				Thread.sleep(r.nextInt(400) + 30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		frame.repaint();
	}

}

class RaceFrame extends JFrame implements ActionListener {
	RaceThreadx thread1;// thread1은 RaceThreadx 타입의 run 메소드를 실행시킨다.
	RaceThreadx thread2;
	RaceThreadx thread3;
	RaceThreadx thread4;
	RaceThreadx thread5;

//	버튼 준비
	JButton startButton = new JButton("시작");
	JButton clearButton = new JButton("초기화");

	Dimension d;

	int i[] = { 0, 0, 0, 0, 0 };
	boolean re1 = true, re2 = true, re3 = true, re4 = true, re5 = true;
	private Image img1, img2, img3, img4, img5;

	public RaceFrame() {

		setLayout(new BorderLayout());
//	    버튼에 수신자 부착
		startButton.addActionListener(this);
		clearButton.addActionListener(this);

//		판넬 준비
		JPanel p = new JPanel();
		p.add(startButton);
		p.add(clearButton);
		add(p, "North");

//		쓰레드 객체생성
		thread1 = new RaceThreadx(this, 50, 100, 38, 36);// 50 이 thread1.x이다.
		thread2 = new RaceThreadx(this, 50, 150, 38, 36);
		thread3 = new RaceThreadx(this, 50, 200, 38, 36);
		thread4 = new RaceThreadx(this, 50, 250, 38, 36);
		thread5 = new RaceThreadx(this, 50, 300, 38, 36);

//		img1 처리
		img1 = Toolkit.getDefaultToolkit().getImage("src/new car.png");
		img2 = Toolkit.getDefaultToolkit().getImage("src/new car2.png");
		img3 = Toolkit.getDefaultToolkit().getImage("src/new car3.png");
		img4 = Toolkit.getDefaultToolkit().getImage("src/new car2.png");
		img5 = Toolkit.getDefaultToolkit().getImage("src/new car3.png");
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		System.out.println("painting");
		g.drawLine(750, 0, 750, 400);

//		등수 판정

		for (int k = 0; k < i.length; k++) {
			if (thread1.x == 750 && i[k] == 0 && re1) { // finish 통과
				i[k] = 1;
				re1 = false;
				break;
			} else if (thread2.x == 750 && i[k] == 0 && re2) { // finish 통과
				i[k] = 2;
				re2 = false;
				break;
			} else if (thread3.x == 750 && i[k] == 0 && re3) { // finish 통과
				i[k] = 3;
				re3 = false;
				break;
			} else if (thread4.x == 750 && i[k] == 0 && re4) { // finish 통과
				i[k] = 4;
				re4 = false;
				break;
			} else if (thread5.x == 750 && i[k] == 0 && re5) { // finish 통과
				i[k] = 5;
				re5 = false;
				break;
			}
		}

		System.out.println(Arrays.toString(i));

		if (i[0] > 0)
			g.drawString("1등 : " + i[0] + "번 자동차", 260, 350);
		if (i[1] > 0)
			g.drawString("2등 : " + i[1] + "번 자동차", 260, 350 + 20);
		if (i[2] > 0)
			g.drawString("3등 : " + i[2] + "번 자동차", 260, 350 + 40);
		if (i[3] > 0)
			g.drawString("4등 : " + i[3] + "번 자동차", 260, 350 + 60);
		if (i[4] > 0)
			g.drawString("5등 : " + i[4] + "번 자동차", 260, 350 + 80);

		g.drawImage(img1, thread1.x, thread1.y, thread1.w, thread1.h, this);
		g.drawImage(img2, thread2.x, thread2.y, thread2.w, thread2.h, this);
		g.drawImage(img3, thread3.x, thread3.y, thread3.w, thread3.h, this);
		g.drawImage(img4, thread4.x, thread4.y, thread4.w, thread4.h, this);
		g.drawImage(img5, thread5.x, thread5.y, thread5.w, thread5.h, this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼신호");
//		시작 버튼을 누르면
		if (e.getSource() == startButton) {
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
			thread5.start();
		} else if (e.getSource() == clearButton) {// 초기화 버튼 누르면 시작할 때의 위치로 다시 가는 작업
			System.out.println("초기화");
			thread1 = new RaceThreadx(this, 50, 100, 38, 36);
			thread2 = new RaceThreadx(this, 50, 150, 38, 36);
			thread3 = new RaceThreadx(this, 50, 200, 38, 36);
			thread4 = new RaceThreadx(this, 50, 250, 38, 36);
			thread5 = new RaceThreadx(this, 50, 300, 38, 36);
			
			for (int k = 0; k < i.length; k++) {
				i[k]=0;
			}
			re1=true;
			re2=true;
			re3=true;
			re4=true;
			re5=true;
			repaint();
		}

	}

}

public class CarRace {
	public static void main(String[] args) {
		RaceFrame frame = new RaceFrame();
		frame.setTitle("Race game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 100);
		frame.setSize(850, 500);
		frame.setVisible(true);
	}
}
