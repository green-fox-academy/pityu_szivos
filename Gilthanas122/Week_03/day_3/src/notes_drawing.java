import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class notes_drawing extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);  // call super class paintComp
        this.setBackground(Color.WHITE);  // set bg color

        g.setColor(Color.BLUE); // colors for our drawing

        // g.fillRect(x. y. width, height); -> draws a rectangle

        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(190, 81, 215));
        g.fillRect(25, 65, 100, 30);

        g.setColor(Color.RED);
        // g.drawString(iterator, x, y); iterator: what you wish to draw

        g.drawString(" Hello World", 100, 150);
    }
}
