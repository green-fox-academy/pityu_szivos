import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class project_hexagon {
    public static void mainDraw(Graphics graphics) {

        int side = 10;
        int x = 30;
        int y = 250;
        int height = side / (int) (Math.sqrt(3));
        int row = 7;

        int iterator = 7;


        for (int i = 4; i < row + 4; i++) {

            if (i  < row ){
                for (int j = 0; j <= i; j++) {
                    drawHex(x, y, side, height, graphics);
                    y = y - height * 2;


                }
                x = x + side + side / 2;
                y = y + height * (i + iterator);
                iterator++;
            }
            else if (i == row){

                for (int j = 0; j <= i; j++) {
                    drawHex(x, y, side, height, graphics);
                    y = y - height * 2;
                }

                x = x + side + side / 2;
                y = y + height * (i + iterator -2);
                iterator--;
            }
            else {
                for (int j = row *2 - i; j >= 0; j--) {
                    drawHex(x, y, side, height, graphics);
                    y = y - height * 2;

                }
                iterator = iterator -2;

                x = x + side + side / 2;
                y = y + height * (row + iterator -1);

            }
        }
    }


    public static void drawHex(int x_coor, int y_coor, int side_coor, int height_coor, Graphics graphics){

        graphics.setColor(Color.BLACK);
        int x_2 = x_coor;
        int y_2 = y_coor;

        for (int i = 0; i <6 ; i++) {

            if (i == 0){
                graphics.drawLine(x_2, y_2, x_2 +side_coor, y_2 );
                x_2 = x_2 + side_coor;
            }
            else if (i == 1){
                graphics.drawLine(x_2, y_2, x_2 + side_coor / 2, y_2 - height_coor);
                x_2 = x_2 +  side_coor / 2;
                y_2 = y_coor - height_coor;
            }
            else if( i == 2){
                graphics.drawLine(x_2, y_2, x_2 - side_coor / 2, y_2 - height_coor);
                x_2 = x_2 - side_coor / 2;
                y_2 = y_2 - height_coor;

            }
            else if (i == 3){
                graphics.drawLine(x_2, y_2, x_2 -side_coor, y_2 );
                x_2 = x_2 - side_coor;
            }
            else if(i == 4){
                graphics.drawLine(x_2, y_2, x_2 - side_coor / 2, y_2 + height_coor);
                x_2 = x_2 - side_coor / 2;
                y_2 = y_2 + height_coor;
            }
            else {
                graphics.drawLine(x_2, y_2, x_2 + side_coor / 2, y_2 + height_coor);
                x_2 = x_2 + side_coor / 2;
                y_2 = y_2 + height_coor;
            }
        }
    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        project_hexagon.ImagePanel panel = new ImagePanel();
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
