import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class project_linePlay {
    public static void mainDraw(Graphics graphics) {


        int x = 30;
        int y = 10;
        int x_2 = 320;
        int y_2 = 20;

        for (int i = 0; i < 14; i++) {

                graphics.setColor(new Color(145, 17, 214));
            linePlay(x, y, x_2, y_2, graphics);


            x = x + 20;
            y_2 = y_2 + 20;
        }
        x = 10;
        y = 30;
        x_2 = 20;
        y_2 = 320;

        for (int i = 0; i <14 ; i++) {

            graphics.setColor(Color.GREEN);
            linePlay(x, y, x_2, y_2, graphics);
            y = y + 20;
            x_2 = x_2 + 20;

        }


    }


    public static void linePlay(int x_coor, int y_coor, int x_2_coor, int y_2_coor, Graphics graphics) {

        graphics.drawLine(x_coor, y_coor, x_2_coor, y_2_coor);
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

