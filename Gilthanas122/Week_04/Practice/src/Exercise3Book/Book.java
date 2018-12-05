package Exercise3Book;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private int pageNumber;
    private int weight;
    private int coverWeight;

    public Book(String author, String title, int releaseYear, int pageNumber) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pageNumber = pageNumber;
    }

    public String returnAuthorTitleYear(){
       return  this.getAuthor() + " " +  this.getTitle() + " " + this.getReleaseYear();
    }

    public int calculateWeight(){
        weight = this.pageNumber * 10 + this.coverWeight;
        return weight;
    }

    public void setCoverWeight(int coverWeight) {
        this.coverWeight = coverWeight;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


   /* Write a program which can store books in a bookshelf.

    There are two types of books.

    Hardcover book
    It should have the following fields: title, author, release year, page number and weight.
    The weight must be calculated from the number of pages (every page weighs 10 grams) plus the weight of the cover which is 100 grams.
    It must have a method that returns a string which contains the following information about the book: author, title and year.
            Paperback book
    It should have the following fields: title, author, release year, page number and weight.
    The weight must be calculated from the number of pages (every page weighs 10 grams) plus the weight of the cover which is 20 grams.
    It must have a method that returns a string which contains the following information about the book: author, title and year.
    You must be able to add books to the bookshelf and must have methods to answer the following problems.

    Who is the author of the lightest book?
    Which author wrote the most pages?*/
}
