package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("We are taking a book from UniLibrary " + book.getName());
    }

    public String returnBook() {
        System.out.println("We are returning a book to UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("We are taking a magazine from UniLibrary");
    }
}
