import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_4Rectangles {

    public static void mainDraw(Graphics graphics){
        Random rand = new Random();


        for (int i = 0; i <4 ; i++) {
            int  width =  rand.nextInt(50) + 1;
            int  height = rand.nextInt(50) + 1;
            int color_1 = rand.nextInt(255) + 1;
            int color_2 = rand.nextInt(255) + 1;
            int color_3 = rand.nextInt(255) + 1;
            if (width > height){
                int x = rand.nextInt(320 - width) + 1;
                int y = rand.nextInt(320 - width) + 1;
                draw_rect(x, y, width, height, color_1,  color_2, color_3, graphics);
            }
            else{
                int x = rand.nextInt(320 - height) + 1;
                int y = rand.nextInt(320 - height) + 1;
                draw_rect(x, y, width, height, color_1,  color_2, color_3, graphics);
            }




        }


    }
    public static void draw_rect(int x_coor, int y_coor, int width_in, int height_in, int color_1_in, int color_2_in, int color_3_in, Graphics graphics){

        graphics.setColor(new Color(color_1_in, color_2_in, color_3_in));
        graphics.fillRect(x_coor, y_coor, width_in, height_in);
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