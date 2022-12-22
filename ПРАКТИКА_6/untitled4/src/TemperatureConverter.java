public class TemperatureConverter implements TemperatureConvert
{
    @Override
    public double converterTemp(double temperature, String convertTo)
    {
        switch (convertTo)
        {
            case "C":
                temperature = temperature;
                break;
            case "CF":
                temperature = (temperature*1.8) + 32;
                break;
            case "CK":
                temperature = temperature + 274;
                break;
            case "KC":
                temperature = temperature - 274;
                break;
            case "FC":
                temperature = (temperature - 32)/1.8;
                break;
        }
        return temperature;
    }

}
