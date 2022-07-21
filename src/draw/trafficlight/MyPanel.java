package draw.trafficlight;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class MyPanel extends JPanel {

    public MyPanel() {
        setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(600, 700));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        // drawing base
        graphics2D.setColor(Color.black);
        graphics2D.fillRoundRect(220,60, 150, 425, 35, 35);
        graphics2D.fillRoundRect(265, 492, 65, 80, 20, 20);
        graphics2D.fillArc(242  , 28, 100, 55, 0, 180);

        // drawing lights
        graphics2D.setColor(Color.red);
        graphics2D.fillOval(244, 90, 100, 105);
        graphics2D.setColor(Color.yellow);
        graphics2D.fillOval(244, 220, 100, 105);
        graphics2D.setColor(Color.green);
        graphics2D.fillOval(244, 355, 100, 105);

        // draw white things over lights
        graphics2D.setColor(Color.white);
        Area a1 = new Area(new Ellipse2D.Double(236.5, 68, 115, 100));
        Area a2 = new Area(new Ellipse2D.Double(236.5, 80, 115,100));
        a1.subtract(a2);
        graphics2D.fill(a1);

        a1 = new Area(new Ellipse2D.Double(236.5, 198, 115, 100));
        a2 = new Area(new Ellipse2D.Double(236.5, 210, 115,100));
        a1.subtract(a2);
        graphics2D.fill(a1);

        a1 = new Area(new Ellipse2D.Double(236.5, 335, 115, 100));
        a2 = new Area(new Ellipse2D.Double(236.5, 347, 115,100));
        a1.subtract(a2);
        graphics2D.fill(a1);

        // draw things near base
        graphics2D.setColor(Color.black);
        paintTriangles(360, 90, g, true);
        paintTriangles(360, 220, g, true);
        paintTriangles(360, 355, g, true);
        paintTriangles(230, 90, g, false);
        paintTriangles(230, 220, g, false);
        paintTriangles(230, 355, g, false);
    }

    private void paintTriangles(int x, int y, Graphics g, boolean isRight) {
        Graphics2D g2D = (Graphics2D) g;
        if(isRight) {
            g2D.fillOval(x + 20, y, 20, 20);
            g2D.fillOval(x + 70, y, 20, 20);
            g2D.fillOval(x + 20, y + 60, 20, 20);

            Polygon polygon = new Polygon(
                    new int[] {x+30, x+80, x+91, x+34, x+21, x+21},
                    new int[] {y, y, y+11, y+80, y+75, y+8},
                    6
            );
            g2D.fillPolygon(polygon);
        }
        else {
            g2D.fillOval(x - 40, y, 20, 20);
            g2D.fillOval(x - 90, y, 20, 20);
            g2D.fillOval(x - 40, y + 60, 20, 20);

            Polygon polygon = new Polygon(
                    new int[] {x-30, x-80, x-91, x-34, x-21, x-20},
                    new int[] {y, y, y+11, y+80, y+75, y+8},
                    6
            );
            g2D.fillPolygon(polygon);
        }
    }
}
