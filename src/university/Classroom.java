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

    public void occupy() {
        status = 1;
    }

    public void free() {
        status = 0;
    }

    void maintenanceCheck() {
        System.out.println("Checking classroom " + number);
    }
}
