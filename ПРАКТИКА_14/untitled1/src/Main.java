import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.regex.*;

public class Main
{
    public static void main(String[] args)
    {

        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "abcdefghijklmnopqrstuv18340.";
        System.out.println(str + ": " + p1.matcher(str).matches());

    }
}
