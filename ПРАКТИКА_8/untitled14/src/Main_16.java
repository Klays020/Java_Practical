public class Main_16 {
    public static int GetCount(int max, int count)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0)
        {
            return count;
        }
        if (n > max)
        {
            return GetCount(n, 1);
        }
        else if (n == max)
        {
            return GetCount(max, count + 1);
        }
        else
        {
            return GetCount(max, count);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(GetCount(0, 0));
    }
}