import java.util.Arrays;
import java.util.Random;
import java.util.*;
import static java.lang.System.out;
public class mas_4 {
    private static int[] mas1 = new int[4];
    public static void mas_4_chislo(){
        for(int i = 0; i<mas1.length; i++ ){
            mas1[i] = (int)(Math.random()*99+10);
            out.print(mas1[i]+" ");
        }
        out.println("\n");
        for(int i = 0, j = 1; i<mas1.length-1; i++,j++)
        {
            if(mas1[i]>=mas1[j]){
                out.println("Этот массив - не строго возрастающая последовательность");
                return;
            }
        }
        out.println("Этот массив - строго возрастающая последовательность");

    }

}
