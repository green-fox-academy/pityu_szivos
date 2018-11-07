import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//NOT READY YET

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_rainbowBoxes {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

      List<Color> rainbow = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLUE, Color.ORANGE, Color.ORANGE);

        double square_size = 3000;
        for (int i = 0; i < rainbow.size(); i++) {

           double side_square = Math.sqrt(square_size);
           int sideSquare_2 = (int) Math.round(side_square);

            graphics.setColor(rainbow.get(i));
            graphics.fillRect(50, 50, sideSquare_2, sideSquare_2);

            square_size = square_size - 300;

        }


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
