package H1;

import java.util.Scanner;

public class Main {
    public static void whatGame(RockPaperScissors rsp) {
        if (rsp instanceof MuckJjiPa) {
            System.out.println("\n[묵찌빠 실행]");
        } else {
            System.out.println("\n[가위바위보 실행]");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RockPaperScissors actGame;

        while (true) {
            System.out.print("[할 게임을 선택 하세요]\n\n[1. 가위 바위 보] [2. 묵찌빠] [종료 : q]\n\n입력 : ");
            String select = scanner.next();

            if (select.equals("q")) {
                System.out.println("\n[종료]");
                break;
            } else if (select.equals("1")) {
                actGame = new RockPaperScissors();
            } else if (select.equals("2")) {
                actGame = new MuckJjiPa();
            } else {
                System.out.println("\n[알 수 없는 명령어 입니다.]\n");
                continue;
            }

            whatGame(actGame);

            while (true) {
                actGame.loseWinOut(actGame.gameAct());
                if (actGame.outGame())
                    break;
            }
        }
    }
}
