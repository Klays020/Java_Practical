import java.util.Scanner;
import java.util.Calendar;

public class Application {
    public static void main(String[] args)
    {
        System.out.println("Введите год: ");
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int year2 = scanner.nextInt();

        int year1 = calendar.get(Calendar.YEAR);
        System.out.println("Введите месяц: ");
        int month2 = scanner.nextInt();
        int month1 = calendar.get(Calendar.MONTH) + 1;
        System.out.println("Введите день: ");
        int day2 = scanner.nextInt();
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Введите час: ");
        int hour2 = scanner.nextInt();
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("Введите минуты: ");
        int minute2 = scanner.nextInt();
        int minute1 = calendar.get(Calendar.MINUTE);
        System.out.println("Введите секунды: ");
        int second2 = scanner.nextInt();
        int second1 = calendar.get(Calendar.SECOND);

        if (year1 == year2)
        {
            System.out.println("Годы совпадают");
        }
        else
        {
            System.out.println("Года не совпадают");
        }

        if (month1 == month2)
        {
            System.out.println("Месяцы совпадают");
        }
        else
        {
            System.out.println("Месяцы не совпадают");
        }

        if (day1 == day2)
        {
            System.out.println("Дни совпадают");
        }
        else
        {
            System.out.println("Дни не совпадают");
        }

        if (hour1 == hour2)
        {
            System.out.println("Часы совпадают");
        }
        else
        {
            System.out.println("Часы не совпадают");
        }

        if (minute1 == minute2)
        {
            System.out.println("Минуты совпадают");
        }
        else
        {
            System.out.println("Минуты не совпадают");
        }

        if (second1 == second2)
        {
            System.out.println("Секунды совпадают");
        }
        else
        {
            System.out.println("Секунды не совпадают");
        }
    }
}