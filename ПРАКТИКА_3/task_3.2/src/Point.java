public class Point {
    private double x = 0;
    private double y = 0;

    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}