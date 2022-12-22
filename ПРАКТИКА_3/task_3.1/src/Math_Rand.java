import java.util.*;
public class Math_Rand {
    private static double[] anArray;
    public static double[] list_sort(){
        Arrays.sort(anArray);
        return anArray;
    }
    public static double[] list() {
        anArray = new double[7];
        for(int i=0;i<anArray.length;i++)
        {
            anArray[i] = new Random().nextDouble()*100;
        }
        return anArray;
    }
    public static double[] list2() {
        anArray = new double[7];
        for(int i=0;i<anArray.length;i++)
        {
            anArray[i] = (double)(Math.random()*100);
        }
        return anArray;
    }
    public static void print(){
        System.out.println(Arrays.toString(anArray));
    }
}