package university;
public class Classroom {

    private int number;
    private String type;
    private int capacity;
    private String equipment;
    private int status;

    public Classroom(int number, String type, int capacity, String equipment, int status) {
        this.number = number;
        this.type = type;
        this.capacity = capacity;
        this.equipment = equipment;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void changeStatus(int status) {
        this.status = status;
    }

    void use() {
    }

    @Override
    public String toString() {
        return "Classroom: " + number +
                ", type=" + type;
    }
}