package draw.snowman;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(700, 800));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        // drawing base
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setStroke(new BasicStroke(4));
        drawBase(200, 450, 300, 270, g);
        drawHands(450, 390, g, false);
        drawBase(220, 290, 250, 230, g);
        drawBase(240, 145, 200, 200, g);

        // drawing hat
        drawBase(240, 120, 200, 45, g);
        g2D.setColor(Color.white);
        g2D.fillRoundRect(284, 27, 110, 100, 20, 20);
        g2D.setColor(Color.black);
        g2D.drawRoundRect(284, 27, 110, 100, 20, 20);
        g2D.drawLine(284, 90, 390 ,90);

        // drawing hands
        drawHands(248, 390, g, true);

        // drawing face
        g2D.setStroke(new BasicStroke(2));
        g2D.drawOval(320, 200, 20, 20);
        g2D.drawOval(380, 200, 20, 20);
        g2D.setColor(Color.orange);
        g2D.fillPolygon(new int[] {350, 470, 351},
                new int[] {240, 235, 260},
                3);
        g2D.setColor(Color.black);
        g2D.drawPolygon(new int[] {350, 470, 351},
                new int[] {240, 235, 260},
                3);
        g2D.drawOval(300, 280, 15, 15);
        g2D.drawOval(325, 290, 15, 15);
        g2D.drawOval(353, 290, 15, 15);
        g2D.drawOval(378, 280, 15, 15);

        // drawing buttons
        g2D.drawOval(350, 380, 15, 15);
        g2D.drawOval(350, 420, 15, 15);
        g2D.drawOval(350, 460, 15, 15);
    }

    public void drawBase(int x, int y, int wight, int height, Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.white);
        g2D.fillOval(x, y, wight, height);
        g2D.setColor(Color.black);
        g2D.drawOval(x, y, wight, height);
    }

    public void drawHands(int x, int y, Graphics g, boolean isLeft) {
        Graphics2D g2D = (Graphics2D) g;
        if(isLeft) {
            g2D.setColor(Color.white);
            g2D.fillPolygon(new int[] {x, x+6, x-150, x-160, x-168, x-160, x-185, x-187, x-160, x-180, x-177, x-145},
                    new int[] {y, y-20, y-50, y-80, y-77, y-49, y-51, y-44, y-40, y-25, y-19, y-38},
                    12);
            g2D.setColor(Color.black);
            g2D.drawPolygon(new int[] {x, x+6, x-150, x-160, x-168, x-160, x-185, x-187, x-160, x-180, x-177, x-145},
                    new int[] {y, y-20, y-50, y-80, y-77, y-49, y-51, y-44, y-40, y-25, y-19, y-38},
                    12);
        }
        else {
            g2D.setColor(Color.white);
            g2D.fillPolygon(new int[] {x, x-6, x+150, x+160, x+168, x+160, x+185, x+187, x+160, x+180, x+177, x+145},
                    new int[] {y, y-20, y-50, y-80, y-77, y-49, y-51, y-44, y-40, y-25, y-19, y-38},
                    12);
            g2D.setColor(Color.black);
            g2D.drawPolygon(new int[] {x, x-6, x+150, x+160, x+168, x+160, x+185, x+187, x+160, x+180, x+177, x+145},
                    new int[] {y, y-20, y-50, y-80, y-77, y-49, y-51, y-44, y-40, y-25, y-19, y-38},
                    12);
        }
    }
}
