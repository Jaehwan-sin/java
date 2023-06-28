package com.tech.w06paint;

import java.util.Scanner;

public class PaintTest {
	public static void main(String[] args) {

		OrientPaint oi = new OrientPaint();
		Oilpaint ol = new Oilpaint();
		WaterPaint wr = new WaterPaint();

		while (true) {
			Scanner a = new Scanner(System.in);
			System.out.println("번호를 입력하세요");
			int b = a.nextInt();

			if (b == -1) {
				System.out.println("프로그램 종료");
				break;
			} else if (!(b >= 1 && b <= 3)) {
				System.out.println("입력범위 초과");
				continue;

			}
			selectone(oi, ol, wr, b);
		}

	}

	private static void selectone(OrientPaint oi, Oilpaint ol, WaterPaint wr, int b) {
		switch (b) {
		case 1:
			oi.doprint();
			oi.oripaint();
			System.out.println("=============");
			break;

		case 2:
			ol.doprint();
			ol.oilpaint();
			System.out.println("=============");
			break;

		case 3:
			wr.doprint();
			wr.watpaint();
			break;
		default:
			break;
		}
	}
}
