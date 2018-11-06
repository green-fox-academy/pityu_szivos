import javax.swing.*;

public class notes_bucky_drawing {

    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        notes_drawing_2 p = new notes_drawing_2();
        f.add(p);
        f.setSize(500, 270);
        f.setVisible(true);
    }
}
