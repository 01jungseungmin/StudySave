package testQ1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CommandMod{
    Queue<String> queue = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    Command command = new Command();

    public void setMode() {
        while (true) {
            System.out.println("\n문서 명령어 모드 선택");
            System.out.println("1. 일반 모드");
            System.out.println("2. 명령 지정 모드");
            System.out.println("3. 종료");

            int command = scanner.nextInt();
            scanner.nextLine();

            if (command == 3) {
                break;
            }
            
            switch (command) {
                case 1:
                    defaultCommand();
                    break;
                case 2:
                    SetCommand();
                    break;
            }
        }
    }

    public void defaultCommand() {
        while (true) {
            System.out.println("\n명령어 선택");
            System.out.println("1. 문서 생성 (make)");
            System.out.println("2. 문서 삭제 (delet)");
            System.out.println("3. 문서 수정 (recontect)");
            System.out.println("4. 문서 검색 (search)");
            System.out.println("5. 종료");

            String select = scanner.nextLine();

            if (select.equals("5")) {
                break;
            }

            command.commandAct(select);
        }
    }

    public void SetCommand() throws NumberFormatException {
        while (true) {
            System.out.println("\n현재 명령어 : " + queue);
            System.out.println("\n명령어 선택");
            System.out.println("1. 문서 생성 (make)");
            System.out.println("2. 문서 삭제 (delet)");
            System.out.println("3. 문서 수정 (recontect)");
            System.out.println("4. 문서 검색 (search)");
            System.out.println("5. 실행");
            System.out.println("6. 종료");

            String select = scanner.nextLine();

            if (select.equals("6")) {
                break;
            } 
            else if (select.equals("5")) {
                while (!queue.isEmpty()) {
                    command.commandAct(queue.poll());
                }
            }else{
                queue.add(select);
            }
        }
    }

    
}
