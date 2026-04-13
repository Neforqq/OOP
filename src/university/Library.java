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
        books--;
    }

    void returnBook() {
        books++;
    }

    @Override
    public String toString() {
        return "Library books=" + books;
    }
}