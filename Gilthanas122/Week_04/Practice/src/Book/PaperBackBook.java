package Book;

public class PaperBackBook extends Book {
    public PaperBackBook(String author, String title, int releaseYear, int pageNumber) {
        super(author, title, releaseYear, pageNumber);
        setCoverWeight(20);
    }
}
