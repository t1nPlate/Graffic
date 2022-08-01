package draw.snowman;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Snowman");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(dm.width/2-350, dm.height/2-400, 700, 800);
        MyPanel panel = new MyPanel();
        this.add(panel);
        this.setVisible(true);
    }
}
