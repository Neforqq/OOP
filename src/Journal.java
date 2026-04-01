public class Journal {

    private String discipline;
    private String[] students;
    private boolean[] attendance;
    private int[] grades;
    private String date;

    public Journal(String discipline, String[] students, boolean[] attendance, int[] grades, String date) {
        this.discipline = discipline;
        this.students = students;
        this.attendance = attendance;
        this.grades = grades;
        this.date = date;
    }

    public void addGrade() {}

    @Override
    public String toString() {
        return "Journal: " + discipline;
    }
}