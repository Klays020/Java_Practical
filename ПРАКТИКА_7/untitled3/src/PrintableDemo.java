public class PrintableDemo
{
    public static void main(String[] args)
    {
        Book book_1 = new Book("name_1");
        Book book_2 = new Book("name_2");
        Shop shop_1 = new Shop("shop_1");
        Shop shop_2 = new Shop("shop_2");

        Printable[] printables = {book_1, book_2, shop_1, shop_2};
        for (Printable printable : printables)
        {
            printable.print();
        }
        System.out.println('\n');
        Book.printBooks(printables);
    }
}