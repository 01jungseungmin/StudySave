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
            System.out.println(i+1 + "일");
            String[] str = getString();
            sd[i] = (str[1].isEmpty()) ? new Schedule(str[0]) : new Schedule(str[0], str[1]);
        }
        return sd;
    }

    @Override
    public void sreachSchedule(Schedule[] schedule,int day) {
        System.out.println("날짜 : " + day + "\n스케줄 : " + schedule[day-1].getSchedule() + "\n장소 : " + schedule[day-1].getPlace());
    }

    abstract public String[] getString();
}
