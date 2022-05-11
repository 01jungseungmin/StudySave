package Q1;

public class Schedule {
    private String schedule;
    private String place;

    public Schedule(String schedule){
        this.schedule = schedule;
        place = "defult";
    }

    public Schedule(String schedule, String place){
        this.schedule = schedule;
        this.place = place;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getPlace() {
        return place;
    }
}
