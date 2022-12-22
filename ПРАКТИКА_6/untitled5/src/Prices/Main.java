package Prices;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
        Pancakes pancakes = new Pancakes();
        System.out.println(tshirt.getPrice());
        System.out.println(pancakes.getPrice());
    }
}