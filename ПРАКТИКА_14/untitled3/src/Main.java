
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(\\w{0,1}\\s{0,}\\d+\\s{0,}\\+\\s{0,}\\d+\\s{0,}\\w{0,1})");
        Matcher m1 = p1.matcher(str);
        boolean a = false;
        while (m1.find())
        {
            a = true;
        }
        if (a == true)
        {
            System.out.println(str);
            System.out.println("True");
        }
        else
        {
            System.out.println("false");
        }
    }
}