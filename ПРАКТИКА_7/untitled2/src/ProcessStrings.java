public class ProcessStrings implements IStrings
{

    public int GetNSymbols(char c, String s)
    {
        int i;
        int k = 0;
        for (i=0; i<s.length(); i++)
            if (c==s.charAt(i))
                k++;
        return k;
    }

    public String ConvertOdd(String s)
    {
        String s2="";
        int i;
        for (i=0; i<s.length(); i++)
        {
            if (i%2==1)
                s2=s2+s.charAt(i);
        }
        return s2;
    }

    public String ReverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        IStrings obj = new ProcessStrings();
        String s1 = "best_progect";
        String s2;
        int k;

        s2 = obj.ConvertOdd(s1);
        k = obj.GetNSymbols('e', s1);

        System.out.println("s2 = " + s2);
        s2 = obj.ReverseString(s2);
        System.out.println("s2 = " + s2);
        System.out.println("k = " + k);
    }
}