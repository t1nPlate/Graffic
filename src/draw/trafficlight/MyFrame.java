package draw.trafficlight;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Traffic Light");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(dimension.width/2-300, dimension.height/2-350, 600, 700);
        MyPanel panel = new MyPanel();
        this.add(panel);
        this.setVisible(true);
    }
}
