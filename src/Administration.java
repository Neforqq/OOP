public class Administration {

    private String position;
    private String fullName;
    private String contacts;
    private String workingArea;
    private int schedule;

    public Administration(String position, String fullName, String contacts, String workingArea, int schedule) {
        this.position = position;
        this.fullName = fullName;
        this.contacts = contacts;
        this.workingArea = workingArea;
        this.schedule = schedule;
    }

    public void manage() {}

    @Override
    public String toString() {
        return "Admin: " + fullName +
                ", position=" + position;
    }
}