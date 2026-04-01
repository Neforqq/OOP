public class Dormitory {

    private int room;
    private int capacity;
    private int floor;
    private boolean furniture;
    private int bathroom;

    public Dormitory(int room, int capacity, int floor, boolean furniture, int bathroom) {
        this.room = room;
        this.capacity = capacity;
        this.floor = floor;
        this.furniture = furniture;
        this.bathroom = bathroom;
    }

    public void settle() {}

    @Override
    public String toString() {
        return "Dorm room=" + room;
    }
}