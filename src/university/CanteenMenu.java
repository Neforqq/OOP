package university;
public class CanteenMenu {

    private int date;
    private String[] menu;
    private int[] calories;
    private int options;
    private int price;

    public CanteenMenu(int date, String[] menu, int[] calories, int options, int price) {
        this.date = date;
        this.menu = menu;
        this.calories = calories;
        this.options = options;
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void buyFood() {
    }

    void showMenu() {
    }

    @Override
    public String toString() {
        return "Menu date=" + date;
    }
}