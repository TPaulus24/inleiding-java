package h04;

import java.awt.*;
import java.applet.*;

public class HalloRocDev4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(50, 300, 200, 1);
        g.drawRect(50, 100, 1, 200);
        g.setColor(Color.red);
        g.fillRect(75, 250, 35, 50);
        g.setColor(Color.yellow);
        g.fillRect(125, 100, 35, 200);
        g.setColor(Color.green);
        g.fillRect(175, 200, 35, 100);
        g.setColor(Color.black);
        g.drawString("20", 25, 250);
        g.drawString("40", 25, 200);
        g.drawString("60", 25, 150);
        g.drawString("80", 25, 100);
        g.drawString("-", 50, 250);
        g.drawString("-", 50, 200);
        g.drawString("-", 50, 150);
        g.drawString("-", 50, 100);
        g.setColor(Color.red);
        g.fillRect(50, 350, 20, 20);
        g.setColor(Color.yellow);
        g.fillRect(50, 400, 20, 20);
        g.setColor(Color.green);
        g.fillRect(50, 450, 20, 20);
        g.setColor(Color.black);
        g.drawString("= Valerie", 75, 365);
        g.drawString("= Jeroen", 75, 415);
        g.drawString("= Hans", 75, 465);



    }
}