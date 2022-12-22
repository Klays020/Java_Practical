public class Main_15 {
    public static int solution(int n)
    {
        if (n < 10)
        {
            return n;
        }
        else
        {
            System.out.println(n % 10);
            return solution(n / 10);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(solution(3748));
    }
}