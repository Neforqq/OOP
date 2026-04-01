public class EducationalInstitution {

    private String name;
    private String type;
    private int studentCount;
    private int teacherCount;
    private String address;

    public EducationalInstitution(String name, String type, int studentCount, int teacherCount, String address) {
        this.name = name;
        this.type = type;
        this.studentCount = studentCount;
        this.teacherCount = teacherCount;
        this.address = address;
    }

    public void hireStaff() {}
    public void organizeProcess() {}

    @Override
    public String toString() {
        return "Institution: " + name + ", type=" + type +
                ", students=" + studentCount +
                ", teachers=" + teacherCount +
                ", address=" + address;
    }
}