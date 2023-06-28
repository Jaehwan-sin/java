package com.tech.Mission;

import java.util.Random;
import java.util.Scanner;

public class GBBGame2 {
    public static void main(String[] args) {
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
