package Library;

import java.util.*;

public class BookShelf {
    private List<Book> bookShelf;

    public BookShelf() {
        this.bookShelf = new ArrayList<>();
    }

    public void addBook(Book book2){
        bookShelf.add(book2);
    }

    public void removeBook(String title){
        for (Book bookInList: bookShelf) {
            if (bookInList.getTitle() == title){
                bookShelf.remove(bookInList);
                //break;
            }
        }
    }

    public void fillwithBook(){
        Book book = new Book("Douglas Adams", "Mostly Harmless", 1992);
        Book book2 = new Book("Douglas Adams", "Hitchhikers guide to the galaxy", 1988);
        Book book3 = new Book("Frank Herbers", "Dune", 1965);
        this.addBook(book);
        this.addBook(book2);
        this.addBook(book3);
    }

    public List<Book> returnBookShelf(){
        return bookShelf;
    }

    public String getFavouriteAuthor(){
        HashMap<String, Integer> favouriteAuthor = new HashMap<>();
        for (Book book: bookShelf) {
            if (favouriteAuthor.containsKey(book.getAuthor())){
                int count = favouriteAuthor.containsKey(book.getTitle()) ? favouriteAuthor.get(book.getTitle()) : 0;
            }else{
                favouriteAuthor.put(book.getAuthor(), 1);
            }
        }
        return "Favourite author: " + Collections.max(favouriteAuthor.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
    }

    public String getEarliestBook(){
        HashMap<String, Integer> favouriteAuthor = new HashMap<>();
        int earliest = 0;
        String earliestTitle = "";
        boolean firstBookIn = false;
        for (Book book: bookShelf) {
           if (!firstBookIn){
               earliest = book.getReleaseYear();
               firstBookIn = true;
           }else if(earliest > book.getReleaseYear()){
               earliest = book.getReleaseYear();
               earliestTitle = book.getTitle();
           }
        }
       return "Earliest released:" + earliestTitle + " : " + "(" + Integer.toString(earliest) + ")";
    }

    public String getLatestBook(){
        HashMap<String, Integer> favouriteAuthor = new HashMap<>();
        int latest = 0;
        String latestTitle = "";
        boolean firstBookIn = false;
        for (Book book: bookShelf) {
            if (!firstBookIn){
                latest = book.getReleaseYear();
                firstBookIn = true;
            }else if(latest < book.getReleaseYear()){
                latest= book.getReleaseYear();
                latestTitle = book.getTitle();
            }
        }
        return "Latest released:" + latestTitle + " : " + "(" + Integer.toString(latest) + ")";
    }

    public int getBookshelfLength(){
        return bookShelf.size();
    }


    @Override
    public String toString() {
        if (bookShelf.size() == 0){
            return " You have no books";
        }
        return "You have " + bookShelf.size()  + " books" + "\n" +
                getEarliestBook() + "\n" + getLatestBook()  + "\n" + getFavouriteAuthor();
    }

}
