public class Teacher {

    private String fullName;
    private String department;
    private int degree;
    private float experience;
    private String contacts;

    public Teacher(String fullName, String department, int degree, float experience, String contacts) {
        this.fullName = fullName;
        this.department = department;
        this.degree = degree;
        this.experience = experience;
        this.contacts = contacts;
    }

    public void teach() {}

    @Override
    public String toString() {
        return "Teacher: " + fullName +
                ", dept=" + department +
                ", degree=" + degree +
                ", exp=" + experience;
    }
}