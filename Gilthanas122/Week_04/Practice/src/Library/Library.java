package Library;

import java.util.List;

public abstract class Library {
        public static void main(String[] args) {
            BookShelf bookShelf = new BookShelf();
            Book book = new Book("Douglas Adams", "Mostly Harmless", 1992);
            Book book2 = new Book("Douglas Adams", "Hitchhikers guide to the galaxy", 1988);
            Book book3 = new Book("Frank Herbers", "Dune", 1965);


            bookShelf.addBook(book);
            bookShelf.addBook(book2);
            bookShelf.addBook(book3);
            bookShelf.removeBook("Mostly Harmless");

            bookShelf.getFavouriteAuthor();
            bookShelf.getEarliestBook();
            System.out.println(bookShelf.toString());
            // Create a Book class, that has an author, a title and a release year
            // Create a constructor for setting those values
            // Book should have a toString() method that returns a string in this format:
            // Douglas Adams : The Hitchhiker's Guide to the Galaxy (1979)
            // Create a Bookshelf class that has a list of books in it
            // We should be able to add and remove books
            // We should be able to query the favourite author (who has written the most books in the shelf)
            // We should be able to query the earliest published books.
            // We should be able to query the latest published books.
            // Bookshelf should have a toString() method which give us information about the number of books, the earliest and the latest released books, and the favourite author
            // Should print out:
            // You have no books here.

            // Should print out:
            // You have 3 books.
            // Earliest released: Frank Herbert : Dune (1965)
            // Latest released: Douglas Adams : Mostly Harmless (1992)
            // Favourite author: Douglas Adams
        }
        public abstract List<Book> returnBookshelf();
    }

