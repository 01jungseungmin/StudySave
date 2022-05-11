package Q1;

abstract public class ScheduleSet implements IScheduleSet{
    
    private int count;

    public ScheduleSet(int count){
        this.count = count;
    }

    @Override
    public Schedule[] makeSchedule() {
        Schedule[] sd = new Schedule[count];

        for (int i = 0; i < sd.length; i++) {
            String[] str = getString();
            sd[i] = (str[2].isEmpty()) ? new Schedule(str[0], str[1]) : new Schedule(str[0], str[1], str[2]);
        }
        return sd;
    }

    @Override
    public void sreachSchedule(Schedule[] schedule, String day) {
        boolean nullIt = true;
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i].getDay().equals(day)) {
                nullIt = false;
                System.out.println("\n일자 : " + schedule[i].getDay() + "\n스케줄 : " 
                + schedule[i].getSchedule() + "\n장소 : " + schedule[i].getPlace() + "\n");
            }
        }
        if(nullIt){
            System.out.println("\n해당 일자에 스케줄이 존재하지 않습니다.\n");
        }
    }

    abstract public String[] getString();
}
