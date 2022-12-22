import java.lang.*;
public class BookTest {
    public static void main(String[] args) {

        Book B1 = new Book("flexible", 200);
        Book B2 = new Book("hardcover", 300);
        Book B3 = new Book("edged binding");
        B3.setPages(100);
        System.out.println(B1);
        B1.Book_Pages();
        B2.Book_Pages();
        B3.Book_Pages();
    }
}