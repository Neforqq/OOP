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

    public void increaseExperience(float years) {
        this.experience += years;
    }

    public void work() {
        System.out.println(fullName + " is working in " + workArea);
    }

    void internalReport() {
        System.out.println("Internal report from staff: " + fullName);
    }

    @Override
    public String toString() {
        return "Staff: " + fullName + ", position=" + position;
    }
}
