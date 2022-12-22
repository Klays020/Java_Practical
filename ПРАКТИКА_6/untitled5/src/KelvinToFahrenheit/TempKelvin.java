package KelvinToFahrenheit;

import java.util.Scanner;

public class TempKelvin implements Convertable{
    private int temp;
    public TempKelvin(){
        Scanner s = new Scanner(System.in);
        System.out.print("Temp in Kelvin: ");
        temp = s.nextInt();
    }

    public void convert(){
        double res = 9 * ((double)temp - 273.15) / 5 + 32;
        System.out.println(String.format("%d Kelvins = %f Fahrenheit", temp, res));
    }
}
