package university;
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ivan Ivanov", 1, "IT", "TO-21", "денна");
        Student s2 = new Student("Petro Petrov", 2, "IT", "TO-22", "денна");

        Teacher t1 = new Teacher("Dr. Smith", "IT", 1, 10, "123");

        EducationalInstitution uni =
                new EducationalInstitution("University", "state", 1000, 100, "Odessa");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addTeacher(t1);

        System.out.println("Students:");
        uni.showStudents();

        System.out.println("\nTeachers:");
        uni.showTeachers();

        System.out.println("\n" + uni);
    }
}
