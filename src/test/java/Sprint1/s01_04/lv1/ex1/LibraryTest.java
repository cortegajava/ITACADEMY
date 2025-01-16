package Sprint1.s01_04.lv1.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testNewLibraryNotNull() {
        Library lib = new Library();

        assertNotNull(lib.getBookList());
    }

    @Test
    void testLibraryIncreasesSize_whenBooksAdded() {
        Library lib = new Library();

        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book2"));
        lib.addBook(new Book("book3"));

        int size = lib.findBook(null);
        assertEquals(3, size);
    }

    @Test
    void testAddBook() {
        Library lib = new Library();

        lib.addBook(new Book("book1"));
        int size = lib.findBook(null);
        assertEquals(1, size);
        assertEquals("book1", lib.getBook("book1").getFirst().getTitle());
    }

    @Test
    void testAddMultipleBooks() {
        Library lib = new Library();

        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book2"));

        int size = lib.findBook(null);
        assertEquals(2, size);
    }

    @Test
    void testGetBookByIndex() {
        Library lib = new Library();

        lib.removeBook("book1");
        lib.removeBook("book2");
        lib.removeBook("book3");

        String title2 = lib.getBook(1).getTitle();
        assertEquals("book2", title2);
    }

    @Test
    void testSortedAlphabetically() {
        Library lib = new Library();

        lib.addBook(new Book("c.book"));
        lib.addBook(new Book("e.book"));
        lib.addBook(new Book("f.book"));
        lib.addBook(new Book("a.book"));
        lib.addBook(new Book("b.book"));

        String titleA = lib.getBook(0).getTitle();
        assertEquals("a.book", titleA);

        lib.addBook(new Book("d.book"));
        lib.removeBook("e.book");

        String titleD = lib.getBook(2).getTitle();
        assertEquals("d.book", titleD);
    }

    @Test
    void testRemoveBook() {
        Library lib = new Library();

        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book2"));
        lib.addBook(new Book("book3"));

        lib.removeBook("book1");
        lib.removeBook("book2");
        lib.removeBook("book3");
        int size = lib.findBook(null);

        assertEquals(3, size);

        lib.removeBook("book1");
        String first = lib.getBook(0).getTitle();
        assertEquals("book2", first);
    }

    @Test
    void testRemoveBookDecreasesSize() {
        Library lib = new Library();

        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book2"));
        lib.addBook(new Book("book3"));

        int size = lib.findBook(null);

        assertEquals(3, size);
        lib.removeBook("book2");

        size = lib.findBook(null);
        assertEquals(2, size);
    }

    @Test
    void testNoDuplicatesAllowed() {
        boolean allowDuplicates = false;
        Library lib = new Library(allowDuplicates);

        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book1"));

        assertEquals(1, lib.getBook("book1").size());
    }

    @Test
    void testAllowingDuplicates() {
        boolean allowDuplicates = true;
        Library lib = new Library(allowDuplicates);

        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book1"));
        lib.addBook(new Book("book1"));

        assertEquals(4, lib.getBook("book1").size());
    }

}