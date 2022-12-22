import java.util.Scanner;
import java.util.regex.Pattern;
public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите паттерн:");
        String p = sc.nextLine();
        Pattern pattern = Pattern.compile(p);
        String[] A = pattern.split(str);
        for (int i = 0; i < A.length; ++i)
        {
            System.out.println(A[i]);
        }
    }
}