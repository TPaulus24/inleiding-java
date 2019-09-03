package h04;

import java.awt.*;
import java.applet.*;

public class HalloRocDev2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawRect(20, 20, 270, 130);
        g.setColor(Color.black);
        g.drawRect(50, 50, 70, 50);
        g.setColor(Color.green);
        g.drawRect(200, 50, 58, 100);

    }
}