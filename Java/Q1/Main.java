package Q1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("스케줄을 정할 날짜 수를 정하세요 : ");
        ScheduleClass sdc = new ScheduleClass(scan.nextInt());
        
        System.out.println("---스케줄 설정---");
        Schedule[] schedule = sdc.makeSchedule();

        while(true){
            System.out.print("스케줄을 검색할 날짜를 입력하세요(종료 : q) : ");
            String day = scan.next();
            if(day.equals("q")){
                break;
            }
            
            try {
                sdc.sreachSchedule(schedule, Integer.parseInt(day));
            } catch (Exception e) {
                System.out.print("지정되어 있는 일자가 아닙니다.\n");
            }
        }
    }
}
