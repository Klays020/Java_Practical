import java.util.Scanner;
import java.util.Calendar;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println("1 - обычный формат, 2 - расширенный формат");
        int x = scanner.nextInt();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String A = "";
        switch (x)
        {
            case 2:
            {
                A+=day+"/"+month+"/"+year+"\n";
            }
            case 1:
            {
                A+=hour+":"+minute+":"+second+"\n";
            }
            default:{}
        }
        System.out.println(A);
    }
}