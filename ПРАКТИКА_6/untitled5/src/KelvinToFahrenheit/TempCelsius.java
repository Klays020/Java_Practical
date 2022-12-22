package KelvinToFahrenheit;

import java.util.Scanner;

public class TempCelsius implements Convertable{
    private int temp;


    public TempCelsius(){
        Scanner s = new Scanner(System.in);
        System.out.print("Temp in Celsius: ");
        temp = s.nextInt();
    }

    public void convert(){
        System.out.println(String.format("%d Celsius = %f Kelvin", temp, temp + 273.15));
    }
}
