package libmngmt.book;

public class BookCopy {
    private final int id;
    private final BookDetails bookDetails;

    public BookCopy(int id, BookDetails bookDetails){
        this.id = id;
        this.bookDetails = bookDetails;
    }
}
