package KelvinToFahrenheit;

import Movable.MovableCircle;
import Movable.MovablePoint;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        TempKelvin temp = new TempKelvin();
        temp.convert();

        TempCelsius tempC = new TempCelsius();
        tempC.convert();
    }
}