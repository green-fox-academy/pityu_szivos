package Exercise3Book;

public class HardCoverBook extends Book {
    public HardCoverBook(String title, String author, int releaseYear, int pageNumber) {
        super(title, author, releaseYear, pageNumber);
        this.setCoverWeight(100);
    }
}
