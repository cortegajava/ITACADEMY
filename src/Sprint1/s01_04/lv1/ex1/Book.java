package Sprint1.s01_04.lv1.ex1;

public class Book implements Comparable<Book> {
    private final String title;
    public Book(String _title) {
        title = _title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book b) {
        return this.getTitle().compareTo(b.getTitle());
    }
}
