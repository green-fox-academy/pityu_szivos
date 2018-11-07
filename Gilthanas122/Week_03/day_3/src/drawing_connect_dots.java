import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_connect_dots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}




       int xPoints[] = {10, 290, 290, 10} ;
       int yPoints [] = {10, 10, 290, 290};
       int zPoints = 4;

        draw_polygon(xPoints, yPoints, zPoints, graphics);

        int xPoints_2[] = {60, 70, 80, 90, 100, 120, 85, 50} ;
        int yPoints_2 [] = {100, 70, 90, 90, 70, 100, 130, 100};
        int zPoints_2 = 8;

        draw_polygon(xPoints_2, yPoints_2, zPoints_2, graphics);


    }

    public static void draw_polygon(int [] x, int [] y, int z, Graphics graphics){
        graphics.drawPolygon(x, y, z);

    }
public static void connectDots(Array[][] connecting, Graphics graphics){
        graphics.setColor(Color.GREEN);


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

