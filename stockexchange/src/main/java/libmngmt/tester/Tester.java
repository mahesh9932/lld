package libmngmt.tester;
import libmngmt.auth.UserAuthenticator;
import libmngmt.book.BookCopy;
import libmngmt.book.BookDetails;
import libmngmt.dataaccesor.DBAccessor;
import libmngmt.id.IDGenerator;
import libmngmt.lib.Library;
import libmngmt.searcher.*;
import libmngmt.user.Member;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

public class Tester {

    private final Library library;

    public Tester(){
        this.library = new Library(new DBAccessor());
    }

    public List<BookCopy> searchByBookName(String bookName){
    if(bookName == null)
        throw new IllegalArgumentException("book name cannot be null");
    BookSearcher bookSearcher = new NameBasedBookSearcher(bookName);
    return bookSearcher.search();
    }

    public List<BookCopy> serachByAuthorNames(List<String> authorNames){
        if(authorNames == null || authorNames.size() ==0)
            throw new IllegalArgumentException("author names cannot be null");
        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorNames);
        return bookSearcher.search();
    }

    public List<Member> searchMembersByName(String name, String adminToken) throws IllegalAccessException{
        if(name ==  null || adminToken == null)
            throw new IllegalArgumentException("member or adminToken name cannot be null");

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("operation forbidden");
        }

        MemberSearcher memberSearcher = new NameBasedMemberSearcher(name);
        return memberSearcher.search();
    }

//    public List<BookCopy> addBook(Book book, String token, int numOfCopies){}
    public void addBook(String bookName, Date publicationDate, List<String> authorNames, String adminToken) throws IllegalAccessException{
//        Logic for input validation
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("operation authorized");
        }
        BookCopy bookCopy = new BookCopy(IDGenerator.generateUniqueID(), new BookDetails(bookName, publicationDate, authorNames));
        library.addBookCopy(bookCopy);
    }

    public void deleteBook(int bookCopyId, String adminToken) throws IllegalAccessException{
//        validation input logic
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("operation unauthorized");
        }
        BookSearcher idBasedBookSearcher = new IDBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = idBasedBookSearcher.search();
        if(bookCopies == null || bookCopies.size() == 0){
            throw new RuntimeException("book copy with given id does not exist");
        }
        library.deleteBookCopy(bookCopies.get(0));
    }

    public void blockMember(int memberId, String adminToken) throws IllegalAccessException{
//        validation logic for inputs
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("token is invalid");
        }
        MemberSearcher idBasedMemberSearcher = new IDBasedMemberSearcher(memberId);
        List<Member> members =idBasedMemberSearcher.search();

        if(members == null || members.size() == 0) {
            throw new RuntimeException("member does not exist with given ID");
        }
        library.blockMember(members.get(0));

    }

    public void issueBook(int bookCopyId, int memberId, String adminToken){
//        validation logic for inputs
//        authorization

        BookSearcher idBasedBookSearcher = new IDBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = idBasedBookSearcher.search();
        if(bookCopies == null || bookCopies.size() == 0){
            throw new RuntimeException("book copy with given id does not exist");
        }

        MemberSearcher idBasedMemberSearcher = new IDBasedMemberSearcher(memberId);
        List<Member> members =idBasedMemberSearcher.search();

        if(members == null || members.size() == 0) {
            throw new RuntimeException("member does not exist with given ID");
        }

        library.issueBook(bookCopies.get(0), members.get(0));

    }

    public void submitBook(int bookCopyId, int memberId, String adminToken){
        //        validation logic for inputs
        //        authorization
        BookSearcher idBasedBookSearcher = new IDBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = idBasedBookSearcher.search();
        if(bookCopies == null || bookCopies.size() == 0){
            throw new RuntimeException("book copy with given id does not exist");
        }

        MemberSearcher idBasedMemberSearcher = new IDBasedMemberSearcher(memberId);
        List<Member> members =idBasedMemberSearcher.search();

        if(members == null || members.size() == 0) {
            throw new RuntimeException("member does not exist with given ID");
        }

         library.submitBook(bookCopies.get(0), members.get(0));


    }

    public Member getBorrower(int bookCopyId, String adminToken){
        //        validation logic for inputs
        //        authorization
        BookSearcher idBasedBookSearcher = new IDBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = idBasedBookSearcher.search();
        if(bookCopies == null || bookCopies.size() == 0){
            throw new RuntimeException("book copy with given id does not exist");
        }

        return library.getBorrower(bookCopies.get(0));

    }

    public List<BookCopy> getBorrowedBooks(int memberId, String adminToken){
        //        validation logic for inputs
        //        authorization
        MemberSearcher idBasedMemberSearcher = new IDBasedMemberSearcher(memberId);
        List<Member> members =idBasedMemberSearcher.search();

        if(members == null || members.size() == 0) {
            throw new RuntimeException("member does not exist with given ID");
        }
        return library.getBorrowedBooks(members.get(0));

    }



}
