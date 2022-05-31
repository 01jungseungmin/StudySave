package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class FileManagementFront {
    Scanner scanner = new Scanner(System.in);
    FileManagement fileManagement = new FileManagement();

    public static void actionPart() throws CloneNotSupportedException {
        FileManagementFront fileManagementFront = new FileManagementFront();

        boolean act = true;

        while (act) {
            act = fileManagementFront.selectMenu();
        }
    }

    public boolean selectMenu() throws CloneNotSupportedException {
        System.out.println("\n[파일 관리 시스템 메뉴] \n1. 파일 생성\n2. 파일 삭제\n3. 파일 검색\n4. 파일 수정\n5. 로그 출력\n6. 특정 위치로 되돌리기\n7. 종료");
        System.out.print("명령 번호 입력 : ");

        int command = scanner.nextInt();

        switch (command) {
            case 7:
                return false;
            case 1:
                makeFile();
                break;
            case 2:
                deletFile();
                break;
            case 3:
                searchFile();
                break;
            case 4:
                reSetting();
                break;
            case 5:
                logPrint();
                break;
            case 6:
                loadLog();
                break;
        }

        return true;
    }

    public void makeFile() throws CloneNotSupportedException {
        System.out.println("\n[파일 생성]");
        System.out.print("파일 이름 : ");
        String fileName = scanner.next();
        System.out.print("파일 경로 : ");
        String fileLocation = scanner.next();
        scanner.nextLine();
        System.out.print("파일 내용 : ");
        String fileContent = scanner.nextLine();

        fileManagement.makeFile(fileName, fileLocation, fileContent);
    }

    public void deletFile() throws CloneNotSupportedException {
        System.out.println("\n[파일 삭제]");
        System.out.print("파일 이름 : ");
        String fileName = scanner.next();

        fileManagement.deletFile(fileName);
    }

    public void searchFile()  {
        System.out.println("\n[파일 검색]");
        System.out.print("파일 이름 : ");

        scanner.nextLine();
        String fileName = scanner.nextLine();;

        ArrayList<String[]> arrayList = fileManagement.searchFile(fileName);

        for (String[] strings : arrayList) {
            System.out.println("\n파일 이름 : " + strings[0] + "\n파일 경로 : " + strings[1] + "\n파일 내용 : " + strings[2]);
        }
    }

    public void reSetting() throws CloneNotSupportedException {
        System.out.println("\n[파일 수정]");
        System.out.print("파일 이름 : ");
        String fileName = scanner.next();

        System.out.println("1.파일 이름 수정\n2. 파일 경로 수정\n3.파일 내용 수정");
        System.out.print("명령 번호 입력 : ");
        int commad = scanner.nextInt();
        scanner.nextLine();

        switch (commad) {
            case 1:
                System.out.print("수정할 파일 이름 : ");
                String reName = scanner.next();
                fileManagement.reNameFile(fileName, reName);
                break;
            case 2:
                System.out.print("수정할 파일 경로 : ");
                String reLocation = scanner.next();
                fileManagement.reLocationFile(fileName, reLocation);;
                break;
            case 3:
                System.out.print("수정할 파일 내용 : ");
                String reContent = scanner.next();
                fileManagement.reContentFile(fileName, reContent);
                break;
        }
    }

    public void logPrint() {
        System.out.println("\n[파일 로그 출력]");
        System.out.print("키워드(생략 가능) : ");
        
        scanner.nextLine();
        String key = scanner.nextLine();

        if (key.isEmpty()) {
            String[] strings = fileManagement.logPrint();

            for (String string : strings) {
                System.out.println(string);
            }
        }
        else {
            String[] strings = fileManagement.logPrint(key);

            for (String string : strings) {
                System.out.println(string);
            }
        }
    }

    public void loadLog() throws CloneNotSupportedException {
        System.out.println("\n[특정 위치로 되돌리기]");
        System.out.print("로그 번호 : ");
        int num = scanner.nextInt();

        fileManagement.loadLog(num);
    }
}
