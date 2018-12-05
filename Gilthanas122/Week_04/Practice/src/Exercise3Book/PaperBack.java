package Exercise3Book;

public class PaperBack extends Book {
    public PaperBack(String title, String author, int releaseYear, int pageNumber) {
        super(title, author, releaseYear, pageNumber);
        this.setCoverWeight(20);
    }
}
