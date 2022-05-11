package Q1;

import java.util.Scanner;

public class ScheduleClass extends ScheduleSet{
    public ScheduleClass(int count) {
        super(count);
    }

    @Override
    public String[] getString() {
        Scanner scan = new Scanner(System.in);
        String[] str = new String[2];
        
        for (int i = 0; i < str.length; i++) {
            System.out.print((i == 0) ? "스케줄 : " : "장소(생략 가능) : ");
            str[i] = scan.nextLine();
        }

        return str;
    }
}
