package university;

public class Library {

    private int books;

    public Library(int books, String catalog, int schedule, int places, boolean readingRoom) {
        this.books = books;
    }

    public int getBooks() {
        return books;
    }

    public void giveBook() {
        if (books > 0) books--;
    }

    void returnBook() {
        books++;
    }

    public void registerVisit(Student student) {
        System.out.println(student + " visited library");
    }

    @Override
    public String toString() {
        return "Library books=" + books;
    }
}
