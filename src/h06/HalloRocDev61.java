package h06;

import java.awt.*;
import java.applet.*;


public class HalloRocDev61 extends Applet {
    int a, b;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("-Jan Betaald  $" + uitkomst, 20, 20);
        g.drawString("-Ali Betaald  $" + uitkomst, 20, 35);
        g.drawString("-Jeanette Betaald  $" + uitkomst, 20, 50);
        g.drawString("-Tom Betaald  $" + uitkomst, 20, 65);
    }
}