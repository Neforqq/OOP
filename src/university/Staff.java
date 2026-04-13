package university;

public class Staff {

    private String position;
    private String fullName;
    private String workArea;
    private int schedule;
    private float experience;

    public Staff(String position, String fullName, String workArea, int schedule, float experience) {
        this.position = position;
        this.fullName = fullName;
        this.workArea = workArea;
        this.schedule = schedule;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void changePosition(String newPosition) {
        this.position = newPosition;
    }

    public void increaseExperience(float years) {
        this.experience += years;
    }

    void work() {
    }

    @Override
    public String toString() {
        return "Staff: " + fullName +
                ", position=" + position +
                ", area=" + workArea +
                ", exp=" + experience;
    }
}