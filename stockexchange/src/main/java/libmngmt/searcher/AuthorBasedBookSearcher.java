package libmngmt.searcher;

import libmngmt.book.BookCopy;
import libmngmt.dataaccesor.DBAccessor;
import libmngmt.dataaccesor.ResultConverter;

import java.util.List;

public class AuthorBasedBookSearcher implements BookSearcher{

    private final List<String> authorNames;
    private final DBAccessor dbaccessor;

    public AuthorBasedBookSearcher(List<String> authorNames){
        this.authorNames = authorNames;
        this.dbaccessor = new DBAccessor();
    }

    public List<BookCopy> search(){
        return ResultConverter.convertToBookCopies(dbaccessor.getBooksByAuthors(authorNames));
    }
}
