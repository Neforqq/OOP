package university;

public class Student {

    private String fullName;
    private int studentId;
    private String faculty;
    private String group;
    private String studyForm;

    private int grade;
    private int attendance;

    public Student(String fullName, int studentId, String faculty, String group, String studyForm) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.faculty = faculty;
        this.group = group;
        this.studyForm = studyForm;

        this.grade = 0;
        this.attendance = 0;
    }

    public void addGrade(int value) {
        this.grade += value;
    }

    public void addAttendance(int value) {
        this.attendance += value;
    }

    public boolean isPassing() {
        return grade >= 60 && attendance >= 70;
    }

    public void study() {
        System.out.println(fullName + " is studying");
    }

    @Override
    public String toString() {
        return "Student: " + fullName +
                ", group=" + group +
                ", grade=" + grade +
                ", attendance=" + attendance;
    }
}
