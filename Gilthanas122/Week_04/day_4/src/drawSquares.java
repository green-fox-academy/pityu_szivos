import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawSquares {

    public static void mainDraw(Graphics graphics) {

        int x = WIDTH / 3;
        int y = 0;


        drawSquares(graphics, WIDTH / 3, x, y);

    }

    public static int drawSquares(Graphics g, int n, int x, int y) {

        if (n < 1) {
            return n;
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    g.drawRect(n, x-n, n, n);
                    y = n + n / 3;
                    for (int k = 0; k < 4; k++) {
                        g.drawRect(n, x-n, n, n);

                    }
                    return drawSquares(g, n / 3, x, y);
                }
            }
            return 0;
        }
    }


        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main (String[]args){
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ImagePanel panel = new ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.pack();
        }

        static class ImagePanel extends JPanel {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                mainDraw(graphics);
            }
        }
    }
