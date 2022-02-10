package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We are taking a book from UniLibrary ");
        System.out.println("---------------------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("We are returning a book to UniLibrary");
        return "flying over cuckoo's nest";
    }

    public void getMagazine() {
        System.out.println("We are taking a magazine from UniLibrary");
        System.out.println("---------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We are returning a magazine to UniLibrary ");
        System.out.println("---------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We are adding a book to UniLibrary ");
        System.out.println("---------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We are adding a magazine to UniLibrary ");
        System.out.println("---------------------------------------------------");
    }
}
