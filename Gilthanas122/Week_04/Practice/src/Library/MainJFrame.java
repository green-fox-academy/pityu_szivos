/*package Library;
import jdk.nashorn.internal.ir.WhileNode;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class MainJFrame {
    public static void mainDraw(Graphics graphics) {


        BookShelf bookShelf2 = new BookShelf();
        Book book = new Book("Douglas Adams", "Mostly Harmless", 1992);
        Book book2 = new Book("Douglas Adams", "Hitchhikers guide to the galaxy", 1988);
        Book book3 = new Book("Frank Herbers", "Dune", 1965);
        bookShelf2.addBook(book);
        bookShelf2.addBook(book2);
        bookShelf2.addBook(book3);
        int rows = bookShelf2.getBookshelfLength();

        JTable table = new JTable(rows, 3);
        int row = 0;
        for (int i = 0; i < rows; i++) {
            table.setValueAt(bookShelf2.returnBookShelf().get(i).getAuthor(), row, 0);
            table.setValueAt(bookShelf2.returnBookShelf().get(i).getTitle(), row, 1);
            table.setValueAt(bookShelf2.returnBookShelf().get(i).getReleaseYear(), row, 1);
            row++;
        }
        int totalWidth = tableHeaderComp.getWidth() + table.getWidth();
        int totalHeight = tableHeaderComp.getHeight() + table.getHeight();
        BufferedImage tableImage = new BufferedImage(totalWidth, totalHeight,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2D = (Graphics2D) tableImage.getGraphics();
        tableHeaderComp.paint(g2D);
        g2D.translate(0, tableHeaderComp.getHeight());
        table.paint(g2D);
        return tableImage;

        public static void draw_triangle ( int x_coor, int y_coor, Graphics graphics){
            graphics.setColor(Color.BLACK);
            int x_2 = x_coor;
            int y_2 = y_coor;

            for (int i = 0; i < 3; i++) {           // drawing a triangle

                if (i == 0) {
                    graphics.drawLine(x_2, y_2, x_2 + 50, y_2);
                    x_2 = x_2 + 50;
                } else if (i == 1) {
                    graphics.drawLine(x_2, y_2, x_2 - 25, y_2 - 43);
                    x_2 = x_2 - 25;
                    y_2 = y_2 - 43;
                } else {
                    graphics.drawLine(x_2, y_2, x_2 - 25, y_2 + 43);
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
/*
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




*/