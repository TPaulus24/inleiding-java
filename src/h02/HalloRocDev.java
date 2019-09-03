package H02;

import java.awt.*;
import java.applet.*;

public class HalloRocDev extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Tom Paulus", 50, 60 );
    }
}
