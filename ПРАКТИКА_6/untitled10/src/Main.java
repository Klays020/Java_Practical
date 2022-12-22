abstract public class Main {
    public static void main(String[] args) {
        Shop s = new Shop();
        s.addComputer();
        s.addComputer();
        s.printComputers();

        s.findComputer();
        s.removeComputer();
        s.printComputers();
    }
}