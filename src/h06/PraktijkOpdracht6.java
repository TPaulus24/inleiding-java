package h06;

import java.awt.*;
import java.applet.*;


public class PraktijkOpdracht6 extends Applet {
    double uitkomst;

    // float voor alle comma getallen en voor de uitkomst zodat de uitkomst ook een comma getal word.
    public void init() {
        float a = 5.9f;
       float b = 6.3f;
        float c = 6.9f;
        float d = 3f;
        uitkomst = (a+b+c) / d;
    }
    // De uitkomst van het gemidelde, gemiddelde is 6.33333.
    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst, 20, 20);
    }
}