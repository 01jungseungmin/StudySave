package sj2.S2;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH) + 1) + "월 " + c.get(Calendar.DATE) + "일");

        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.print("일요일 ");
                break;
            case 2:
                System.out.print("월요일 ");
                break;
            case 3:
                System.out.print("화요일 ");
                break;
            case 4:
                System.out.print("수요일 ");
                break;
            case 5:
                System.out.print("목요일 ");
                break;
            case 6:
                System.out.print("금요일 ");
                break;
            case 7:
                System.out.print("토요일 ");
                break;
        }
        
        switch (c.get(Calendar.AM_PM)) {
            case 0:
                System.out.println("오전");
                break;
            case 1:
                System.out.println("오후");
        }

        System.out.println(c.get(Calendar.HOUR) + "시 " + c.get(Calendar.MINUTE) + "분 " + c.get(Calendar.SECOND) + "초");
    }
}
