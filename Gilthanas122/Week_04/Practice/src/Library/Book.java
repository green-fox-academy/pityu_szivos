package Library;

public class Book {
    private String author;
    private String title;
    private int releaseYear;

    @Override
    public String toString() {
        return author + '\'' + " : " + title + '\'' + "("+ releaseYear + ")";
    }

    public Book(String author, String title, int releaseYear) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

}
