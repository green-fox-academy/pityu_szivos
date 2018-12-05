package Exercise3Book;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        PaperBack bookPaper = new PaperBack("Emile Zola", "Nana", 1920, 200);
        PaperBack bookPaper2 = new PaperBack("James Jones", "Now and ever", 1960, 300);
        HardCoverBook bookHard = new HardCoverBook("Frank Herbert", "Dune", 1970, 1000);
        HardCoverBook bookHard2 = new HardCoverBook("Stanislaw Lem", "Kiberiad", 1965, 250);
        HardCoverBook bookHard3 = new HardCoverBook("Stanislaw Lem", "Kiberiad", 1965, 250);
        HardCoverBook bookHard4 = new HardCoverBook("Stanislaw Lem", "Kiberiad", 1965, 250);

        bookShelf.addBook(bookHard);
        bookShelf.addBook(bookHard2);
        bookShelf.addBook(bookHard3);
        bookShelf.addBook(bookHard4);
        bookShelf.addBook(bookPaper);
        bookShelf.addBook(bookPaper2);
        System.out.println(bookHard.returnAuthorTitleYear());

        System.out.println(bookShelf.lightestBook());
        System.out.println(bookShelf.mostPages());

    }
}
