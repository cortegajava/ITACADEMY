package Sprint1.s01_04.lv1.ex1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LibraryTest {

    private final Library lib = new Library();
    // TODO: make tests unitary, use maven
    // revise months instructions

    @Test
    void testLibrary() {

        // Book List not null
        assertNotNull(lib.getBookList());

        // Book addition
        lib.addBook(new Book("book1"));
        int size = lib.findBook(null);
        assertEquals(1, size);

        // Multiple books
        lib.addBook(new Book("book2"));
        size = lib.findBook(null);
        assertEquals(2, size);

        // Access by index
        String title2 = lib.getBook(1).getTitle();
        assertEquals("book2", title2);

        // Sorted Alphabetically
        lib.addBook(new Book("abook"));
        String title0 = lib.getBook(0).getTitle();
        assertEquals("abook", title0);

        // Book removal
        size = lib.findBook(null);
        assertEquals(3, size);
        lib.removeBook("abook");
        String first = lib.getBook(0).getTitle();
        assertEquals("book1", first);

        // Book removal decreases size
        size = lib.findBook(null);
        assertEquals(2, size);

        // No duplicates
        assertEquals(1, lib.getBook("book1").size());
        lib.addBook(new Book("book1"));
        assertEquals(1, lib.getBook("book1").size());

    }
}
