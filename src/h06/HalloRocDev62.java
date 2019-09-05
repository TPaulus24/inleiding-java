package h06;

import java.awt.*;
import java.applet.*;


public class HalloRocDev62 extends Applet {
    int a, b;
    double uitkomst;
    int d;
    double uit;
    int f;
    double uur;


    public void init() {
        a = 60;
        b = 60;
        uitkomst = a * b;
        d = 24;
        uit = d * uitkomst;
        f = 36524;
        uur = uit * f;
    }

    public void paint(Graphics g) {
        g.drawString("-Seconden in een uur  ->     " + uitkomst, 20, 20);
        g.drawString("-Seconden in een dag ->   " + uit, 20, 35);
        g.drawString("-Seconden in een jaar ->    " + uur, 20, 50);
    }
}