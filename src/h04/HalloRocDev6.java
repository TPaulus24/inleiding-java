package h04;

import java.awt.*;
import java.applet.*;

public class HalloRocDev6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRoundRect(20, 20, 50, 115, 10, 10);
        g.drawRect(37, 135, 15, 100);
        g.setColor(Color.red);
        g.fillArc(27, 25, 35, 35, 90, 360);
        g.setColor(Color.orange);
        g.fillArc(27, 60, 35, 35, 90, 360);
        g.setColor(Color.green);
        g.fillArc(27, 95, 35, 35, 90, 360);






    }
}