public class Student {

    private String fullName;
    private int studentId;
    private String faculty;
    private String group;
    private String studyForm;

    public Student(String fullName, int studentId, String faculty, String group, String studyForm) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.faculty = faculty;
        this.group = group;
        this.studyForm = studyForm;
    }

    public String getGroup() {
        return group;
    }

    public void study() {
        System.out.println(fullName + " is studying");
    }

    @Override
    public String toString() {
        return "Student: " + fullName + ", group=" + group;
    }
}
