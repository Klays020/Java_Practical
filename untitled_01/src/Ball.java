import java.lang.*;
public class Ball {
    private String Colour;
    private int size;
    public Ball(String n, int a){
        Colour = n;
        size = a;
    }
    public Ball(String n){
        Colour = n;
        size = 0;

    }
    public Ball(){
        Colour = "White";
        size = 0;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setColour(String Colour) {
        this.Colour = Colour;
    }
    public String getColour(String Colour){
        return Colour;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return this.Colour+", size "+this.size;
    }
    public void ball_size(){
        System.out.println("A " +Colour+" ball with a size of "+size*5+" centimeters");
    }
}