public class TestBall {
    public static void main(String[] args) {
        Ball B = new Ball(500, 500);
        System.out.println(B);
        B.move(-20, 40);
        System.out.println(B);
    }
}