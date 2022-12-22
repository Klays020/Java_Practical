public class Book implements Printable {
    private String name;

    public Book(String name){
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public static void printBooks(Printable[] printables){
        for (Printable printable:printables){
            if (printable instanceof Book)
                printable.print();
        }
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Printing book " + getName());
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + '}';
    }
}