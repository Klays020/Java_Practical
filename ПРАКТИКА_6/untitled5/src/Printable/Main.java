package Printable;

import Movable.MovableCircle;
import Movable.MovablePoint;

public class Main {
    public static void main(String[] args) {
        Printable[] arr = new Printable[4];
        arr[0] = new Book();
        arr[1] = new Magazine();
        arr[2] = new Book();
        arr[3] = new Magazine();
        for (int i = 0; i < 4; i++){
            arr[i].print();
        }
    }
}