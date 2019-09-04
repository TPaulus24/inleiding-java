package h04;

import java.awt.*;
import java.applet.*;

public class HalloRocDev7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRoundRect(20, 20, 190, 190, 10, 10);
        g.setColor(Color.black);
        g.fillArc(50, 50, 60, 60, 90, 360);
        g.fillArc(50, 120, 60, 60, 90, 360);
        g.fillArc(120, 50, 60, 60, 90, 360);
        g.fillArc(120, 120, 60, 60, 90, 360);








    }
}