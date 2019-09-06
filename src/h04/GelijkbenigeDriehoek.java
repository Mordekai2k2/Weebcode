package h04;

import java.awt.*;
import java.applet.*;

public class GelijkbenigeDriehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.PINK);
        g.setColor(Color.GREEN);
        g.drawLine(100, 50, 125, 100);
        g.drawLine(100, 50, 75, 100);
        g.drawLine(125, 100, 75, 100);
    }
}