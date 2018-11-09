import javax.swing.*;
import java.awt.*;

//import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class project_triangles_2{
    public static void mainDraw(Graphics graphics) {

        int x = 160;
        int y = 50;
        int row = 12;
        int side = 20;
        int height = side /((int) (Math.sqrt(3)));


        for (int i = 0; i < row; i++) {         //row
            for (int j = 0; j <= i; j++) {       // triangle
                draw_triangle(x, y, graphics, side, height);
                x = x + side;
                // if ( x < 50 || x > 320 -x){
            }

            x = x - side * (i + 1) - side / 2;
            y = y + height;
        }
    }



    public static void draw_triangle(int x_coor, int y_coor, Graphics graphics, int side_in, int height_in){
        graphics.setColor(Color.BLACK);
        int x_2 = x_coor;
        int y_2 = y_coor;

        for (int i = 0; i < 3; i++) {           // drawing a triangle

            if (i == 0) {
                graphics.drawLine(x_2, y_2, x_2 + side_in, y_2);
                x_2 = x_2 + side_in;
            }
            else if (i == 1){
                graphics.drawLine(x_2, y_2, x_2 - side_in / 2, y_2 - height_in);
                x_2 = x_2 - side_in / 2;
                y_2 = y_2 -height_in;
            }
            else{
                graphics.drawLine(x_2 , y_2, x_2 -side_in / 2, y_2 + height_in);
                x_2 = x_2 - side_in / 2;
                y_2 = y_2 + height_in;
            }
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




