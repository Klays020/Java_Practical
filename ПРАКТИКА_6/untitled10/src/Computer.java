import java.util.Scanner;

public class Computer implements Enterable{
    public String name;
    public int price;
    public Processor cpu;
    public Memory mem;
    public Monitor moni;

    public Computer(){
        cpu = new Processor();
        mem = new Memory();
        moni = new Monitor();
        setName();
        setPrice();
        setFreq();
        setWidthAndHeight();
    }

    public void setName(){
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        name = s.nextLine();
    }

    public void setPrice(){
        Scanner s = new Scanner(System.in);
        System.out.print("Price: ");
        price = s.nextInt();
    }

    public void setFreq() {
        Scanner s = new Scanner(System.in);
        System.out.print("Frequency: ");
        cpu.setFreq(s.nextDouble());
    }

    public void setWidthAndHeight(){
        Scanner s = new Scanner(System.in);
        System.out.print("Width and Height: ");
        moni.setWidth(s.nextInt());
        moni.setHeight(s.nextInt());
    }

    public Computer(String name, int price, double cpu_f, double cpu_v, int m_width, int m_height, int m_size) {
        cpu = new Processor(cpu_f, cpu_v);
        mem = new Memory();
        moni = new Monitor(m_width, m_height, m_size);
        name = name;
        price = price;
    }

    public void printComp(){
        System.out.println(String.format("%s — %d rubles — %f gHz — %d pixels", name, price, cpu.getFreq(), moni.getResolution()));
    }
}
