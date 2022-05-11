package sj2.S4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public int computerSelect(){
        Random random = new Random();
        int select = random.nextInt(3);

        switch (select) {
            case 0:
                System.out.println("컴퓨터 : 가위");
                break;
            case 1:
                System.out.println("컴퓨터 : 바위");
                break;
            case 2:
                System.out.println("컴퓨터 : 보");
                break;
        }

        return select;
    }

    public void winLose(String playerSelect, int computer){
        switch (playerSelect) {
            case "가위":
                switch (computer) {
                    case 0:
                        System.out.println("\n[비겼습니다]\n");
                        break;
                    case 1:
                        System.out.println("\n[컴퓨터 승리]\n");
                        break;
                    case 2:
                        System.out.println("\n[플레이어 승리]\n");
                        break;
                }
                break;
            case "바위":
                switch (computer) {
                    case 0:
                        System.out.println("\n[플레이어 승리]\n");
                        break;
                    case 1:
                        System.out.println("\n[비겼습니다]\n");
                        break;
                    case 2:
                        System.out.println("\n[컴퓨터 승리]\n");
                        break;
                }
                break;
            case "보":
                switch (computer) {
                    case 0:
                        System.out.println("\n[컴퓨터 승리]\n");
                        break;
                    case 1:
                        System.out.println("\n[플레이어 승리]\n");
                        break;
                    case 2:
                        System.out.println("\n[비겼습니다]\n");
                        break;
                }
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main game = new Main();

        System.out.println("------가위 바위 보 게임------");

        while (true) {
            System.out.println("\n[가위] [바위] [보] [종료 : -1]\n");
            System.out.print("입력 : ");
            String playerSelect = scanner.nextLine();
            System.out.println();

            if (playerSelect.equals("-1")) {
                System.out.println("[게임 종료]");
                break;
            }
            else if (!(playerSelect.equals("가위") || playerSelect.equals("바위") || playerSelect.equals("보"))) {
                System.out.println("\n[가위 바위 보 중 하나를 입력해 주세요.]");
                continue;
            }

            System.out.println("플레이어 : " + playerSelect);
            int computer = game.computerSelect();

            game.winLose(playerSelect, computer);

        }
    }
}
