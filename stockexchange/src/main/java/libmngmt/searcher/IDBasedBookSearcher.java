package libmngmt.searcher;

import libmngmt.book.BookCopy;

import java.util.List;

public class IDBasedBookSearcher implements BookSearcher{

    private final int id;

    public IDBasedBookSearcher(int id){
        this.id = id;
    }

    public List<BookCopy> search(){
        return null;
    }
}
