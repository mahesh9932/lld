package libmngmt.searcher;

import libmngmt.book.BookCopy;

import java.util.List;

public interface BookSearcher {

    List<BookCopy> search();
}
