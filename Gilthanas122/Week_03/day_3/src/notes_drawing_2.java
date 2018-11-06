import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class notes_drawing_2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        // g.drawLine(x1, y1, x2, y2); -> coordinates for first and second
        g.drawLine(10, 25, 200, 45);

        g.setColor(Color.RED);
        g.drawRect(10, 44, 100, 30 );           // draws an empty rect

        g.setColor(Color.GREEN);
        g.fillOval(10, 95, 100, 30);

        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 50, true);// raised -> true: 3d look

    }
}
