public class Main {

    public static void main(String[] args) {

        Student s = new Student("Ivan Ivanov", 1, "IT", "TO-21", "денна");
        Teacher t = new Teacher("Petro Petrov", "IT", 2, 5.5f, "123");

        System.out.println(s.toString());
        System.out.println(t.toString());
    }
}