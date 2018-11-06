import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_center_lines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int y = 0;
        int x = 0;

        for (int i = 0; i <34 ; i++) {
            if(i < 17){
                draw_lines(x, y, graphics);
                x = x + 20;
            }
            else{
                x = 0;
                draw_lines(x, y, graphics);
                y = y + 20;
            }
        }

        int x_2 = 0;
        int y_2 = 0;

        for (int i = 0; i <34 ; i++) {
            if(i < 17){
                x_2 = 320;
                draw_lines(x_2, y_2, graphics);
                y_2 = y_2 + 20;
            }
            else{
                y_2 = 320;
                draw_lines(x_2, y_2, graphics);
                x_2 = x_2 - 20;
            }
        }

    }
public static void draw_lines(int x_coor, int y_coor, Graphics graphics){

        graphics.setColor(Color.BLACK);
        graphics.drawLine(x_coor, y_coor, 160, 160);
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
