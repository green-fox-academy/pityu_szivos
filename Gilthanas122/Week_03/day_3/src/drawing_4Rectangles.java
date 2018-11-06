import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_4Rectangles {

    public static void mainDraw(Graphics graphics){

        int x = 50;
        int y = 50;
        int width = 30;
        int height = 20;
        for (int i = 0; i <4 ; i++) {
            graphics.setColor(Color.BLUE);
            graphics.drawRect(x, y, width, height);

           x = x + 10;
           y = y + 20;
           width = width + 15;
           height = height + 10;
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