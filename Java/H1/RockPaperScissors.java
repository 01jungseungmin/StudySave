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
}
