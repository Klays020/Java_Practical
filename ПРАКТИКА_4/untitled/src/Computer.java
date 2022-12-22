public class Computer
{
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Processor processor, Memory memory, Monitor monitor)
    {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public static void main(String[] args)
    {
        Processor processor = new Processor("9-ого");
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor(32, "AMOLED");
        System.out.println("Компьютер идет вместе с монитором от компании " + monitor.firm_1 + ", который обладает диагональю " + monitor.get_Monitor_1() +
                " дюйма и матрицей " + monitor.get_Monitor_2() + ".\nВнутри компьютера установлен процессор " + processor.get_Processor() +" поколения фирмы " + processor.firm_3 +
                ", а также в нем стоит " + memory.getSize() + " Гб оперативной памяти компании " + memory.firm_2 + ".");
    }
}

