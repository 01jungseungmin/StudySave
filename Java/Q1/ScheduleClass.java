package Q1;

import java.util.Scanner;

public class ScheduleClass extends ScheduleSet{
    public ScheduleClass(int count) {
        super(count);
    }

    @Override
    public String[] getString() {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[3];
        
        for (int i = 0; i < str.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("스케줄 : ");
                    str[i] = scan.nextLine();
                    break;
                case 1:
                    System.out.print("장소 : ");
                    str[i] = scan.nextLine();
                    break;
                case 2:
                    System.out.print("시간(공란시 오늘 설정)) : ");
                    str[i] = scan.nextLine();
                    break;
            }
        }
        System.out.println();

        return str;
    }
}
