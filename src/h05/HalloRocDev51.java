package h05;

import java.awt.*;
import java.applet.*;

public class HalloRocDev51 extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 100;
        hoogte = 50;
    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, 120, 20);
        g.drawString("Lijn", 65, 35);
        g.drawRect(20, 45, breedte, hoogte);
        g.drawString("Rechthoek", 45, 110);
        g.drawRoundRect(20, 120, breedte, hoogte, 10, 10);
        g.drawString("Afgeronde rechthoek", 15, 185);
        g.setColor(opvulkleur);
        g.fillRect(140, 45, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(140, 45, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 120, 110);
        g.setColor(opvulkleur);
        g.fillOval(140, 120, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 150, 185);
        g.drawOval(300, 45, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(300, 45, breedte, hoogte, 90, 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 290, 110);
        g.drawOval(320, 120, 50, 50);
        g.drawString("Cirkel", 330, 185);
    }
}