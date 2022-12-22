public class TestInterface
{
    public static void main(String[] args)
    {
        Priceable p = new Excursion("Путевка в Турцию", 65400);
        System.out.println(p);
        System.out.println(p.getPrice());
        p = new Laptop(40000, "десятая модель");
        System.out.println(p);

    }

}