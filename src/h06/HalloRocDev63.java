package h06;

import java.awt.*;
import java.applet.*;


public class HalloRocDev63 extends Applet {
    int a, b;
    double uitkomst;


    public void init() {
        a = +8;
        b = +8;
        uitkomst = a+b ;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " +- uitkomst, 20, 20);
    }
}