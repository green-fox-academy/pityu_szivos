import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class drawing_checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int y = 0;
        for (int i = 0; i <8 ; i++) {
            int x = 0;
            for (int j = 0; j < 8; j++) {
                if( j % 2 == 0 && i % 2 == 0){
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(x, y, 40, 40);
                    x = x + 40;
            }
            else if(j % 2 == 0 && i % 2 == 1){
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(x, y, 40, 40);
                    x = x + 40;
                }
                else if( j % 2 == 1 && i % 2 == 1){
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(x, y, 40, 40);
                    x = x + 40;

                }
            else{
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(x, y, 40, 40);
                    x = x + 40;
                }


            }
            y = y + 40;
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

