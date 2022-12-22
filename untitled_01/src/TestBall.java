import java.lang.*;
public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball("Green", 2);
        Ball b2 = new Ball("Blue", 7);
        Ball b3 = new Ball("Black");
        b3.setSize(1);
        System.out.println(b1);
        b1.ball_size();
        b2.ball_size();
        b3.ball_size();
    }
}