import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_starry_night {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        Random rand = new Random();



        int i = 0;
       while (i < 10){

           int  x = rand.nextInt(319) + 1;
           int  y = rand.nextInt(319) + 1;
           int color = rand.nextInt(255) + 1;

            starry_night(x, y, graphics, color);
            i++;

        }


    }

    public static void starry_night(int x_coor, int y_coor, Graphics graphics, int r) {

            graphics.setColor(new Color(r, r, r));
            graphics.drawRect(x_coor, y_coor, 20, 20);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
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
            this.setBackground(Color.BLACK);
        }
    }
}
