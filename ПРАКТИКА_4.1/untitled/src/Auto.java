public abstract class Auto
{
    protected double timeP;
    protected double priceP;

    protected double timeW;
    protected double priceW;

    public abstract double getWTime();
    public abstract double getWPrice();

    public abstract double getPTime();
    public abstract double getPPrice();

    public abstract void setWTime(double timeW);
    public abstract void setWPrice(double priceW);

    public abstract void setPTime(double timeP);
    public abstract void setPPrice(double priceP);

}