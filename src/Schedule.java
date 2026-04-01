public class Schedule {

    private String day;
    private int time;
    private String discipline;
    private String teacher;
    private int room;

    public Schedule(String day, int time, String discipline, String teacher, int room) {
        this.day = day;
        this.time = time;
        this.discipline = discipline;
        this.teacher = teacher;
        this.room = room;
    }

    public void show() {}

    @Override
    public String toString() {
        return "Schedule: " + day + ", " + discipline;
    }
}