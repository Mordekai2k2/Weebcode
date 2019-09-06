package h04;

import java.awt.*;
import java.applet.*;

public class Huisje extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.PINK);
        g.setColor(Color.GREEN);
        g.drawLine(100, 25, 175, 100);
        g.drawLine(100, 25, 25, 100);
        g.drawLine(175, 100, 25, 100);
        g.drawRect(50, 100, 100, 75);
        g.drawRect(110, 135, 20, 40);
        g.drawOval(88, 60, 25, 25);
        g.drawRoundRect(60, 140, 35, 20, 10, 10);
    }
}