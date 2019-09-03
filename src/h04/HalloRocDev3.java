package h04;

import java.awt.*;
import java.applet.*;

public class HalloRocDev3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.fillRect(60, 106, 270, 46);
        g.setColor(Color.red);
        g.fillRect(60,20,270,43);
        g.setColor(Color.black);
        g.drawRect(60, 20, 270, 130);
        g.setColor(Color.orange);
        g.fillRect(60, 20, 30, 270);


    }
}