import java.lang.*;
public class Book {
    private String Binding;
    private int Pages;
    public Book(String n, int a){
        Binding = n;
        Pages = a;
    }
    public Book(String n){
        Binding = n;
        Pages = 0;

    }
    public Book(){
        Binding = "White";
        Pages = 0;
    }
    public void setPages(int size) {
        this.Pages = size;
    }
    public void setColour(String Binding) {
        this.Binding = Binding;
    }
    public String getColour(String Binding){
        return Binding;
    }
    public int getPages() {
        return Pages;
    }
    public String toString(){
        return this.Binding+", pages "+this.Pages;
    }
    public void Book_Pages(){
        System.out.println("A " +Binding+" book with "+Pages*5+" pages");
    }
}