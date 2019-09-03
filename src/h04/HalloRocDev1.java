import java.awt.*;
import java.applet.*;

public class HalloRocDev1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, -120, 270, 120);
        g.drawLine(50, 120, 270, -120);

    }
}