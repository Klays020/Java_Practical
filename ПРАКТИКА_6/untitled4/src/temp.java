public class temp
{
    public static void main(String[] args)
    {
        TemperatureConverter myTemp = new TemperatureConverter();
        double tempnow = myTemp.converterTemp(-40, "CF");
        System.out.println(tempnow);
    }
}