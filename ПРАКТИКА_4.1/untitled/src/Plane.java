public class Plane extends Auto
{
    @Override
    public double getWTime()
    {
        return timeW;
    }

    @Override
    public double getWPrice()
    {
        return priceW;
    }


    @Override
    public double getPTime()
    {
        return timeP;
    }

    @Override
    public double getPPrice()
    {
        return priceP;
    }


    @Override
    public void setWTime(double timeW)
    {
        this.timeW = timeW;
    }

    @Override
    public void setWPrice(double priceW)
    {
        this.priceW = priceW;
    }

    @Override
    public void setPTime(double timeP)
    {
        this.timeP = timeP;
    }

    @Override
    public void setPPrice(double priceP)
    {
        this.priceP = priceP;
    }
}