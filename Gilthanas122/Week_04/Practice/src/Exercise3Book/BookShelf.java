package Exercise3Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BookShelf {
    List<Book> bookShelf;

    public BookShelf() {
        this.bookShelf = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookShelf.add(book);
    }

    public String lightestBook(){
        String lightestAuthor= "";
        int lightest = 0;
        boolean firstBookIn = false;
        for (Book book: bookShelf) {
            if (!firstBookIn){
                lightest = book.calculateWeight();
                lightestAuthor = book.getAuthor();
                firstBookIn = true;
            }else if(lightest > book.calculateWeight()){
                lightest = book.calculateWeight();
                lightestAuthor = book.getAuthor();
            }
        }
        return "Author of the lightest book: " + lightestAuthor;
    }

    public String mostPages(){
        HashMap<String, Integer> favouriteAuthor = new HashMap<>();
        for (Book book: bookShelf) {
            if (favouriteAuthor.containsKey(book.getAuthor())){
                int count = favouriteAuthor.containsKey(book.getAuthor()) ? favouriteAuthor.get(book.getAuthor()) : 0;
                favouriteAuthor.put(book.getAuthor(), count + book.getPageNumber());
            }else{
                favouriteAuthor.put(book.getAuthor(), book.getPageNumber());
            }
        }
        return "The author, who wrote the most books: " + Collections.max(favouriteAuthor.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
    }

}
