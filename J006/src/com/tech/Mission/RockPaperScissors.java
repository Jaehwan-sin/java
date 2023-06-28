package com.tech.Mission;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("가위바위보 게임 시작!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요: ");
            int userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            int computerChoice = (int) (Math.random() * 3) + 1;
            System.out.println("컴퓨터가 선택한 것: " + computerChoice);

            if (userChoice == computerChoice) {
                System.out.println("비겼습니다.");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("사용자가 이겼습니다!");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }

            System.out.print("다시 하시겠습니까? (y/n) ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("y")) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}

