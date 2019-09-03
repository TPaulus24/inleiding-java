package H02;

import java.awt.*;
import java.applet.*;

public class HalloRocDev2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Tom", 55, 60 );
        g.setColor(Color.red);
        g.drawString("Paulus" , 50, 80);
    }
}
