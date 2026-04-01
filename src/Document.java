public class Document {

    private int type;
    private int id;
    private String date;
    private String author;
    private int status;

    public Document(int type, int id, String date, String author, int status) {
        this.type = type;
        this.id = id;
        this.date = date;
        this.author = author;
        this.status = status;
    }

    public void archive() {}

    @Override
    public String toString() {
        return "Document id=" + id;
    }
}