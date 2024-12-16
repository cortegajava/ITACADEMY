package Sprint1.s01_04.lv1.ex1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Library {
    /**
    * weird ass specifications...
    **/
    private final ArrayList<Book> books;
    private boolean allowDuplicates;

    public Library(boolean allowDuplicates) {
        books = new ArrayList<>();
        this.allowDuplicates = allowDuplicates;
    }
    public Library() {
        this(false);
    }

    public void addBook(Book book) {
        if(!allowDuplicates && this.findBook(book.getTitle()) != -1) return;
        books.add(book);
        this.sortLibrary();
    }
    public void addBook(Book book, int index) {
        if(!allowDuplicates && this.findBook(book.getTitle()) != -1) return;
        books.add(index, book);
        this.sortLibrary();
    }

    /**
     *  Removes all books with matching title.
     **/
    public void removeBook(String bookTitle) {
        int i = 0;
        do {
            i = findBook(bookTitle, i);
            if (i > -1) books.remove(i);
        } while (i > -1);
        this.sortLibrary();
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
     *   If not such book exists, returns -1.
     *   If the title is null, returns the size of the library.
     *   @param i: index to start looking from, can be used to find multiple books efficiently.
     **/
    public int findBook(String title, int i) {
        if(title == null) {
            return books.size();
        }
        for(; i < books.size(); i++) {
            if(title.equals(books.get(i).getTitle())){
                return i;
            }
        }
        return -1;
    }
    public int findBook(String title) {
        return findBook(title, 0);
    }

    public void sortLibrary(){
        books.sort(Comparator.naturalOrder());
    }

}
