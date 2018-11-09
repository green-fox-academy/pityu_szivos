import jdk.nashorn.internal.ir.WhileNode;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class project_triangles{
        public static void mainDraw(Graphics graphics) {

            int x = 160;
            int y = 50;
            int row = 11;


            for (int i = 0; i < row; i++) {         //row
                for (int j = 0; j <= i; j++) {       // triangle
                    draw_triangle(x, y, graphics);

                    x = x + 50;

                }


                x = x - 50 * (i + 1) - 25;
                y = y + 43;
            }
        }



        public static void draw_triangle(int x_coor, int y_coor, Graphics graphics){
            graphics.setColor(Color.BLACK);
            int x_2 = x_coor;
            int y_2 = y_coor;

            for (int i = 0; i < 3; i++) {           // drawing a triangle

                if (i == 0) {
                    graphics.drawLine(x_2, y_2, x_2 + 50, y_2);
                    x_2 = x_2 + 50;
                }
                else if (i == 1){
                    graphics.drawLine(x_2, y_2, x_2 - 25, y_2 - 43);
                    x_2 = x_2 - 25;
                    y_2 = y_2 -43;
                }
                else{
                    graphics.drawLine(x_2 , y_2, x_2 -25, y_2 + 43);
                    x_2 = x_2 - 25;
                    y_2 = y_2 + 43;
                }


               /* if (i == 0) {
                    graphics.drawLine(x_coor, y_coor, x_coor + 50, y_coor);
                }
                else if (i == 1){
                    graphics.drawLine(x_coor + 50, y_coor, x_coor + 25, y_coor - 43);
                }
                else{
                    graphics.drawLine(x_coor + 25, y_coor - 43, x_coor, y_coor);
                }*/

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



