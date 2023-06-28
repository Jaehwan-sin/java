package com.tech.Mission;

import java.util.Scanner;

public class GBBGame3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("가위바위보 게임");
            System.out.println("1. 주먹 2. 가위 3. 보자기");
            System.out.println("숫자를 입력하세요.");
            int user = scanner.nextInt();
            int com = (int) (Math.random() * 3) + 1;

            System.out.print("유저 : ");
            printHand(user);
            System.out.print("컴퓨터 : ");
            printHand(com);

            int result = compare(user, com);
            if (result == 1) {
                System.out.println("유저 승!");
            } else if (result == -1) {
                System.out.println("컴퓨터 승!");
            } else {
                System.out.println("무승부");
            }

            System.out.println("다시 게임을 하시겠습니까? (Y/N)");
            String answer = scanner.next().toUpperCase();
            playAgain = answer.equals("Y");
        }
    }

    private static void printHand(int hand) {
        switch (hand) {
            case 1:
                System.out.println("주먹");
                break;
            case 2:
                System.out.println("가위");
                break;
            case 3:
                System.out.println("보자기");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    private static int compare(int user, int com) {
        if (user == com) {
            return 0;
        } else if ((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
}
