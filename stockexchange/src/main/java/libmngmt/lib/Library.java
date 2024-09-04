package libmngmt.lib;

import libmngmt.book.BookCopy;
import libmngmt.dataaccesor.DBAccessor;
import libmngmt.dataaccesor.ResultConverter;
import libmngmt.user.Member;

import java.util.List;


public class Library {

    private final DBAccessor dbaccessor;

    public Library(DBAccessor dbaccessor){
        this.dbaccessor = dbaccessor;
    }


    public void addBookCopy(BookCopy bookCopy){
        dbaccessor.addBook(bookCopy);
    }

    public void deleteBookCopy(BookCopy bookCopy){
        if(dbaccessor.isCopyAvailable(bookCopy)){
            dbaccessor.deleteBook(bookCopy);
        }
    }

    public void blockMember(Member member){
        dbaccessor.markAsBlocked(member);
    }

    public void issueBook(BookCopy bookCopy, Member member){
        if(dbaccessor.isCopyAvailable(bookCopy)){
            dbaccessor.issueBookToMember(bookCopy, member);
        }
    }

    public void submitBook(BookCopy bookCopy, Member member){
    }

    public Member getBorrower(BookCopy bookCopy){
        return ResultConverter.convertToMember(dbaccessor.getBorrower(bookCopy));
    }

    public List<BookCopy> getBorrowedBooks(Member member){
        return ResultConverter.convertToBookCopies(dbaccessor.getBorrowedBooks(member));
    }
}
