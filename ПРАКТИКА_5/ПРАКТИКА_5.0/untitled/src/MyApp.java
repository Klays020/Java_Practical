
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
class MyApp extends JFrame {
    int WINDOW_WIDTH = 900;
    int WINDOW_HEIGHT = 700;
    String background_image_path = "C:/Java/Практика/ПРАКТИКА_5.0/untitled/background.jpg";
    String animation_images_path = "C:/Java/Практика/ПРАКТИКА_5.0/untitled/frames/";
    int method;

    MyApp() {
        super("Some shapes");
        setSize(WINDOW_WIDTH -30, WINDOW_HEIGHT -30);
        setLocation(0, 0);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        Button btn = new Button("Start animation");
        btn.setSize(150, 80);
        btn.setLocation(0, 0);
        btn.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                        method = 1;
                        setTitle("Animation");
                        setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                        setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                    }
                }
        );
        add(btn);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

        switch (this.method) {
            case 0:
                random_shapes_paint(25, g);
                break;

            case 1:
                animate(this.animation_images_path, g);
                break;

            default:
                break;
        }
    }

    void random_shapes_paint(int shapes, Graphics2D g) {
        int k=0;
        for (int i = 0; i < shapes; i++) {
            if (k == 3) k = 0;
            k++;

            switch (k) {
                // Oval
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval((int) (Math.random() * WINDOW_WIDTH-150), (int) (Math.random() * WINDOW_HEIGHT-150),
                            (int) (100), (int) (100));
                    break;
                // Rect
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect((int) (Math.random() * WINDOW_WIDTH-150), (int) (Math.random() * WINDOW_HEIGHT-150),
                            (int) (130), (int) (130));
                    break;
                // Circle
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval((int) (Math.random() * WINDOW_WIDTH-150), (int) (Math.random() * WINDOW_HEIGHT-150),
                            100, 100);
                    break;

                default:
                    break;
            }
        }
    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        if (args.length == 1) {
            app.set_background_image_path(args[0]);
        }
        else if (args.length == 2) {
            app.set_background_image_path(args[0]);
            app.set_animation_images_path(args[1]);
        }
    }
}