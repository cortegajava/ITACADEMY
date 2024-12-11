package Sprint1.s01_04.lv1;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addBook(Book book, int index) {
        books.add(index, book);
    }

    /**
     *  Removes all books with matching title.
     **/
    public void removeBook(String bookTitle) {
        int i = 0;
        do {
            i = findBook(bookTitle, i);
            books.remove(i);
        } while (i > -1);

        books.remove(findBook(bookTitle, 0));
    }

    /**
     *  Returns a copy of the book list.
     **/
    public List<Book> getBookList() {
        return (List<Book>) books.clone();
    }

    public String getTitle(int index) {
        return books.get(index).getTitle();
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    /**
     *  Gets all books with matching title.
     **/
    public List<Book> getBook(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    /**
     *   Returns index that matches with a book by the title.
     *   @param i: index to start looking from, used to find multiple books.
     **/
    public int findBook(String title, int i) {
        for(; i < books.size(); i++) {
            if(title.equals(books.get(i).getTitle())){
                return i;
            }
        }
        return -1;
    }

}
