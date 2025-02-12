package com.pch.homework.view;

import com.pch.homework.controller.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void displayMenu() throws IOException {
        Function f = new Function();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean quit = true;
        while (quit) {

            System.out.println("\n\n1. 간단 계산기");
            System.out.println("2. 작은 수에서 큰 수까지 합계");
            System.out.println("3. 신상 정보 확인");
            System.out.println("4. 학생 정보 확인");
            System.out.println("5. 별과 숫자 출력");
            System.out.println("6. 난수까지의 합계");
            System.out.println("7. 구구단");
            System.out.println("8. 주사위 숫자 알아맞추기 게임");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호 : ");
            int n = Integer.parseInt(br.readLine());

            switch (n) {
                case 1:f.calculator();
                break;
                case 2:f.totalCalculator();
                break;
                case 3:f.printProfile();
                break;
                case 4:f.printScore();
                break;
                case 5:f.printStarNumber();
                break;
                case 6:f.sumRandom();
                break;
                case 7:f.exceptGugu();
                break;
                case 8:f.diceGame();
                break;
                case 9:
                    System.out.println("종료합니다.");
                    quit = false;
                break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }








        }
    }
}
