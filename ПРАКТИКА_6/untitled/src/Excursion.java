public class Excursion implements Priceable
{
    private String name;
    private double price;

    public Excursion(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }


    @Override
    public String toString()
    {
        return "Excursion {" +
                "name='" + name + '\'' +
                ", price=" + price;
    }
}