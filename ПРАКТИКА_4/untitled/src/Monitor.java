public class Monitor
{
    private int diagonal;
    private String matrix;
    firms firm_1 = firms.ASUS;
    Monitor(int diagonal, String matrix)
    {
        this.diagonal = diagonal;
        this.matrix = matrix;
    }
    public int get_Monitor_1()
    {
        return diagonal;
    }
    public String get_Monitor_2()
    {
        return matrix;
    }
}
