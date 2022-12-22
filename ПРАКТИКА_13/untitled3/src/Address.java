import java.util.StringTokenizer;

public class Address
{
    private String country, region, city, street, house, housing, flat;

    public Address(String stringToParse, boolean multiDivider)
    {
        String[] s;
        if(multiDivider){
            StringTokenizer st = new StringTokenizer(stringToParse, "',.;");
            s = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens()) s[i++] = st.nextToken();
        }else{
            s = stringToParse.split(",");
        }
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        Address a1 = new Address("Россия, Московская область, Москва, проспект Вернадского, 78, 7, И-105-1", true);
        Address a2 = new Address("Украина, Киевская область', Киев. Liyhuanian prospect; 454;2;68", true);
        System.out.println(a1);
        System.out.println(a2);


    }
}