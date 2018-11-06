import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_purple_2 {
    public static void mainDraw(Graphics graphics) {

        int y = 10;
        int x = 10;
        int heigth = 10;
        int width = 10;
        for (int i = 0; i <8 ; i++) {

            purple_squares(x, y, width, heigth, graphics);
            y = y  + heigth;
            x = x  + heigth;
            heigth = heigth + 10;
            width =  width + 10;

        }

    }

    public static void purple_squares(int  x_coor, int y_coor, int heigth_coor, int width_coor, Graphics graphics){

        graphics.setColor(new Color(145, 17, 214));
        graphics.fill3DRect(x_coor, y_coor, heigth_coor, width_coor, true);
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
