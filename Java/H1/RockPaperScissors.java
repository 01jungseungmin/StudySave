package H1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements IGameFrame {

    @Override
    public String computerSelect() {
        Random random = new Random();
        int selectNum = random.nextInt(2);
        String select = "";
        
        switch (selectNum) {
            case 0:
                select = "가위";
                break;
            case 1:
                select = "바위";
                break;
            case 2:
                select = "보";
                break;
        }

        return select;
    }

    @Override
    public String userSelect() {
        Scanner scanner = new Scanner(System.in);
        String select = "";

        while (true) {
            System.out.println("\n[가위] [바위] [보]\n");
            select = scanner.next();

            if (!(select.equals("가위") || select.equals("바위") || select.equals("보"))) {
                System.out.println("\n[가위 바위 보 중 하나를 입력해 주세요.]");
                continue;
            }
            else {
                break;
            }
        }

        return select;
    }

    @Override
    public boolean gameAct() {
        boolean losewin = true;

        while (true) {
            String user = userSelect();
            String computer = computerSelect();

            System.out.println("\n유저 : " + user);
            System.out.println("컴퓨터 : " + computer);

            if (user.equals(computer)) {
                System.out.println("\n[비겼습니다]\n");
                continue;
            }
            else {
                switch (user) {
                    case "가위":
                        if (computer.equals("바위"))
                            losewin = false;
                        break;
                    case "바위":
                        if (computer.equals("보"))
                            losewin = false;
                        break;
                    case "보":
                        if (computer.equals("가위"))
                            losewin = false;
                        break;
                }
                break;
            }
        }

        return losewin;
    }

    @Override
    public void loseWinOut(boolean loseWin) {
        if (loseWin)
            System.out.println("\n[유저 승리]\n");
        else
            System.out.println("\n[컴퓨터 승리]\n");
    }

    @Override
    public boolean outGame() {
        Scanner scanner = new Scanner(System.in);
        boolean regame = false;

        while (true) {
            System.out.println("[게임을 종료 하시겠습니까? Y/N]\n");
            String select = scanner.next();

            if(select.equals("Y") || select.equals("y")){
                System.out.println("\n[게임 종료]\n");
                regame = true;
                break;
            }
            else if (select.equals("N") || select.equals("n")) {
                break;
            }
            else {
                System.out.println("\n[알 수 없는 명령어입니다]\n");
            }
        }
        return regame;
    }
    
}
