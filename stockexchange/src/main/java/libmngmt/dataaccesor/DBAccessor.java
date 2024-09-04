package libmngmt.dataaccesor;

import libmngmt.book.BookCopy;
import libmngmt.user.Member;

import java.util.List;

public class DBAccessor {

    public void addBook(BookCopy bookCopy){}

    public void deleteBook(BookCopy bookCopy){}

    public boolean isCopyAvailable(BookCopy bookCopy){return true;}

    public Results getBooksByName(String bookName){return null;}

    public Results getBooksByAuthors(List<String> authors){return null;}

    public Results getMembersByName(String name){
        return null;
    }

    public void issueBookToMember(BookCopy bookCopy, Member member){}

    public void submitBookFromMember(BookCopy bookCopy, Member member){}

    public void markAsBlocked(Member member){}

    public Results getBorrower(BookCopy bookCopy){
        return null;
    }

    public Results getBorrowedBooks(Member member){
        return null;
    }

}
