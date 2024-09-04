package libmngmt.searcher;

import libmngmt.book.BookCopy;

import java.util.List;

public class NameBasedBookSearcher implements BookSearcher{

    private final String bookName;

    public NameBasedBookSearcher(String bookName){
        this.bookName = bookName;
    }


    public List<BookCopy> search() {
        return null;
    }
}
