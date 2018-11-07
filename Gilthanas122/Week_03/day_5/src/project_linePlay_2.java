import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class project_linePlay_2 {
    public static void mainDraw(Graphics graphics) {


        ArrayList<Integer> xCoor = new ArrayList<Integer>();
        ArrayList<Integer> yCoor = new ArrayList<Integer>();

        int align = 8;

        for (int i = 10; i <WIDTH ; i += align) {
            xCoor.add(i);
            yCoor.add(i);
        }

        for (int i = 1; i < yCoor.size()  ; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, yCoor.get(i), xCoor.get(i), WIDTH);
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(WIDTH, yCoor.get(i),xCoor.get(i), 0);
        }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        project_linePlay_2.ImagePanel panel = new ImagePanel();
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




