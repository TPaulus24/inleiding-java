package h04;

import java.awt.*;
import java.applet.*;

public class HalloRocDevPraktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(20, 20, 120, 20);
        g.drawString("Lijn", 65, 35);
        g.drawRect(20, 45, 100, 50);
        g.drawString("Rechthoek", 45, 110);
        g.drawRoundRect(20, 120, 100, 50, 10, 10);
        g.drawString("Afgeronde rechthoek", 15, 185);
        g.setColor(Color.magenta);
        g.fillRect(140, 45, 100, 50);
        g.setColor(Color.black);
        g.drawOval(140, 45, 100, 50);
        g.drawString("Gevulde rechthoek met ovaal", 120, 110);
        g.setColor(Color.magenta);
        g.fillOval(140, 120, 100, 50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 150, 185);
        g.drawOval(300, 45, 100, 50);
        g.setColor(Color.magenta);
        g.fillArc(300, 45, 100, 50, 90, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 290, 110);
        g.drawOval(320, 120, 50, 50);
        g.drawString("Cirkel", 330, 185);







    }
}
