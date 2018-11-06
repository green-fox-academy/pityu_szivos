import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

//NOT READY

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_go_center {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        int x_coord = 50;
        int y_coord = 60;
        for (int j = 0; j <3 ; j++) {



          draw_line(x_coord, y_coord, graphics);


            x_coord = x_coord + 50;
            y_coord = y_coord + 20;
        }

    }
    public static void draw_line(int x, int y, Graphics graphics){

        graphics.setColor(Color.GREEN);
        graphics.drawLine(x, y, 160, 160);

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
        }
    }
}
