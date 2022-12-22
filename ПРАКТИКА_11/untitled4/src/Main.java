
import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA(500);
        System.out.println(A.toString());
        Date date1 = new Date();
        A.sort(0, 499);
        Date date2 = new Date();
        System.out.println(A.toString());
        System.out.println(date2.getSeconds() - date1.getSeconds());

    }
}