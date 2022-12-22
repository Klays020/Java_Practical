
public class MathFunc implements MathCalculable
{

    public double AbsComplex(double real, double imag)
    {
        double abs;
        abs = Math.sqrt(real*real+imag*imag);
        return abs;
    }

    public int Power(int x, int y)
    {
        int p, i;
        p = 1;
        for (i=1; i<=y; i++)
            p=p*x;
        return p;
    }

    public double Circumference(double radius)
    {
        return 2*pi*radius;
    }

    public static void main(String[] args)
    {
        MathCalculable mf = new MathFunc();
        int d;
        double x;
        d = mf.Power(3, 5);
        x = mf.AbsComplex(2, 3);
        System.out.println(d);
        System.out.println(x);
        double pi;
        pi = mf.pi; // pi = 3.1415926535
        System.out.println(pi);
    }
}