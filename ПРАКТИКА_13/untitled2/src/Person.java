public class Person
{
    private String name="", surname, patronymic="";

    public Person(String surname)
    {
        this.surname = surname;
    }

    public Person(String name, String surname, String patronymic)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }


    public String toString()
    {
        String A = surname;
        if (!name.equals(""))
        {
            A += " ";
            A += name.substring(0,1);
            A+=".";
            if (!patronymic.equals(""))
            {
                A+=patronymic.substring(0,1);
                A+=".";
            }
        }
        return A;
    }

    public static void main(String[] args)
    {
        Person p1 = new Person("Зайцев");
        Person p2 = new Person("", "Воробьев", "");
        Person p3 = new Person("Никита", "Боров", "Алексеевич");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
