public class PhoneParser
{
    private String code, city, triplet, quadruple;

    public PhoneParser(String phone)
    {
        if(phone.startsWith("8"))
        {
            code = "+7";
        }else
        {
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        triplet = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    @Override
    public String toString()
    {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args)
    {
        System.out.println(new PhoneParser("89175655655"));
        System.out.println(new PhoneParser("+79175655655"));
    }
}