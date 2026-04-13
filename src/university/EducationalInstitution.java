package university;

import java.util.ArrayList;

public class EducationalInstitution {

    private String name;
    private String type;
    private int studentCount;
    private int teacherCount;
    private String address;

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

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

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Enrolled: " + student);
    }

    public void assignTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Assigned: " + teacher);
    }

    public void showStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void showTeachers() {
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "Institution: " + name;
    }
}
