package university;

import java.util.ArrayList;

public class EducationalInstitution {

    private String name;
    private String type;
    private int studentCount;
    private int teacherCount;
    private String address;

    private ArrayList<Student> students = new ArrayList<>();

    public EducationalInstitution(String name, String type, int studentCount, int teacherCount, String address) {
        this.name = name;
        this.type = type;
        this.studentCount = studentCount;
        this.teacherCount = teacherCount;
        this.address = address;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    void showStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public String getName() {
        return name;
    }

    public void hireStaff() {}
    void organizeProcess() {}

    @Override
    public String toString() {
        return "Institution: " + name +
                ", type=" + type +
                ", students=" + studentCount +
                ", teachers=" + teacherCount +
                ", address=" + address;
    }
}